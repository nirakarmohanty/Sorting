package com.nirakar.camel.core;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelHelloWorldFileCopyExample {

	public static void main(String[] args) {
		 CamelContext camelContext = new DefaultCamelContext();
		 final String sourceFolder = "file://D://Java_Study//test";
	        final String destinationFolder = "file://D://Java_Study//test//output";
		   try
		   { 
		      camelContext.addRoutes(new RouteBuilder(){
		            @Override
		            public void configure() throws Exception
		            {
		               from(sourceFolder).to(destinationFolder);
		            }
		         });
		      camelContext.start();
		      Thread.sleep(1000);
		      camelContext.stop();
		   }
		   catch (Exception camelException)
		   {
		      //Logger.log(Level.SEVERE,"Exception trying to copy files - {0}",camelException.toString());
			   System.out.println("Catch the exception");
		   }

	}

}
