package com.angeras.kriscamel.configuration;

import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.angeras.kriscamel.configuration.routes.AppInRoute;

@Configuration
@ComponentScan("com.angeras.kriscamel.configuration.routes")
public class RouteConfig extends CamelConfiguration {

	@Autowired
	AppInRoute appInRoute;
}
