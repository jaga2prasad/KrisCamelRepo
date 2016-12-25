package com.angeras.kriscamel.configuration.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AppInRoute extends SpringRouteBuilder{

	@Override
	public void configure() throws Exception {
		System.out.println("Camel Test");
		
	}

}
