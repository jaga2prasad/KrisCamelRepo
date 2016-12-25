package com.angeras.kriscamel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.angeras.kriscamel.bean.AppBean;

@Configuration

@Import({RouteConfig.class})
public class AppConfig {

	@Bean 
	public AppBean appBean(){
		return new AppBean();
	}
	
}
