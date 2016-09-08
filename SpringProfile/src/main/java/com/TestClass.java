package com;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
    @Test
    public void testAnnotationConfigApplicationContextThatWorks() {

        // Can register a list of config classes
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("test1");
        ctx.register(Test1ProfileConfig.class, Test2ProfileConfig.class);
        ctx.refresh();

        Person person = ctx.getBean("employee", Person.class);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

    }
}
