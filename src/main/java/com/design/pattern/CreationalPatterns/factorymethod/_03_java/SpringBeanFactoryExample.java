package com.design.pattern.CreationalPatterns.factorymethod._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {

    public static void main(String[] args) {
        // BeanFactory -> Creator Interface
        // ClassPathXmlApplicationContext, AnnotationConfigApplicationContext => Object 타입의 Product -> Concrete Product
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);
    }
}
