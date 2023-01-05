package com.sampleProject.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Sample code for  launching spring context.
 */

public class HelloWorldSpring {
    public static void main(String[] args) {
        //Launch Spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("personToMethodCall"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("address1"));
        System.out.println(context.getBean(Address.class));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
