package com.angeras.kriscamel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.angeras.kriscamel.bean.AppBean;
import com.angeras.kriscamel.configuration.AppConfig;
import com.angeras.kriscamel.configuration.routes.AppInRoute;


/**
 * Hello world!
 *
 */
public class App 
{
	
public static void main(String[] args) {
	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
	AppBean appBean =  appContext.getBean(AppBean.class);
	
	appBean.setEmpID("123");
	
	System.out.println(appBean.getEmpID());
	
	
	AppInRoute sir = appContext.getBean(AppInRoute.class);
	
	try {
		sir.configure();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
    
}
