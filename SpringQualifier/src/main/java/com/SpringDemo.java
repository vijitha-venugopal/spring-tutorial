package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class SpringDemo {
    public static void main(String[] args) throws SQLException {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	    DessertService dessert = ctx.getBean(DessertService.class);
	    dessert.getDessert().printName();
	}
}  