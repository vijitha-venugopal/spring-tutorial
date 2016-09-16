package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx =new FileSystemXmlApplicationContext("SpringConstructorDI/src/applicationcontext.xml");
        Employee s=(Employee)ctx.getBean("e");
        s.show();



    }  
} 