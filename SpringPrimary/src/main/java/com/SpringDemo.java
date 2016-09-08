package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	    Dessert dessert = ctx.getBean(Dessert.class);
	    dessert.dessertName();
	}
}  