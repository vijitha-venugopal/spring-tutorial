package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
      TextEditor te = (TextEditor) ctx.getBean("textEditor");
      te.spellCheck();
   }
}