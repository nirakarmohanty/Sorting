package com.nirakar.camel.core;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * An example class for demonstrating some of the basics behind Camel. This
 * example sends some text messages on to a JMS Queue, consumes them and
 * persists them to disk
 */
public final class CamelJmsToFileExample {

	private CamelJmsToFileExample() {
	}

	public static void main(String args[]) throws Exception {
		// START SNIPPET: e1
		CamelContext context = new DefaultCamelContext();
		
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
		// Note we can explicit name the component
		context.addComponent("test-jms",JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("test-jms:queue:test.queue").to("file://D://Java_Study//test");
			}
		});
		
		ProducerTemplate template = context.createProducerTemplate();
		
		context.start();
		
		for (int i = 0; i < 10; i++) {
			template.sendBody("test-jms:queue:test.queue", "Test Message: " + i);
			System.out.println("Test Message: " + i);
		}
		
		Thread.sleep(1000);
		context.stop();
	}
}
