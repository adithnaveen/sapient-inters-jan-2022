package com.naveen.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.beans.Mobile;
import com.naveen.cfg.AppConfig;

public class AnnotationMobileApp2 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class); 
		Mobile mobile = context.getBean("getMobile", Mobile.class);
		System.out.println(mobile);
	}
}
