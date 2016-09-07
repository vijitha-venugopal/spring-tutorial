package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
 
     
    public static void main(String[] args) {
        ApplicationContext ctx =new FileSystemXmlApplicationContext("SpringAopWithXml/src/animal.xml");
        Animal dog=(Animal)ctx.getBean("dog");
        Animal cat=(Animal)ctx.getBean("cat");
        dog.eat();
        cat.eat();
//        File f = new File("SpringAopWithXml/src/animal.xml");
//        System.out.println("Exist test: " + f.exists());
    }
 
}
