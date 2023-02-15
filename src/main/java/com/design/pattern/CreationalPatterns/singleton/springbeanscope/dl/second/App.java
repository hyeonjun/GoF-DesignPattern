package com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl.second;

import com.design.pattern.CreationalPatterns.singleton.springbeanscope.dl.PrototypeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
      new AnnotationConfigApplicationContext(Client2.class, PrototypeBean.class);

    Client2 client1 = applicationContext.getBean(Client2.class);
    System.out.println(client1.logic()); // PrototypeBean@47faa49c, 1

    Client2 client2 = applicationContext.getBean(Client2.class);
    System.out.println(client2.logic()); // PrototypeBean@28f2a10f, 1

    System.out.println(client1 == client2); // true
  }
}
