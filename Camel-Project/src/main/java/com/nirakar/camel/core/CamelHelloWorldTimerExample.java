package com.nirakar.camel.core;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.LoggerFactory;

public class CamelHelloWorldTimerExample {
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		//org.slf4j.Logger LOG = LoggerFactory.getLogger(CamelHelloWorldTimerExample.class);
		try {
			context.addRoutes(new RouteBuilder() {
				@Override
				public void configure() throws Exception {
					from("timer://myTimer?period=2000")
					.setBody()
				    .simple("Hello World Camel fired at ${header.firedTime}")
				    .to("stream:out");;
				}
			});
			context.start();
			Thread.sleep(10000);
		} finally {
			context.stop();
		}
	}
}
