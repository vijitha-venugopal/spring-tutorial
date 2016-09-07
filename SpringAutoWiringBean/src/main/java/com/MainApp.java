package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx =new FileSystemXmlApplicationContext("SpringAutoWiringBean/src/Beann.xml");
      A a=ctx.getBean("a",A.class);
      a.display();
   }
}