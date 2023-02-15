package com.design.pattern.CreationalPatterns.abstractfactory._03_java;

import com.design.pattern.CreationalPatterns.factorymethod._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

  public static void main(String[] args) {
    // xml 설정
//    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//    Ship whiteShip = applicationContext.getBean("whiteship", Ship.class);
//    System.out.println(whiteShip.getName()); // whiteship
//    System.out.println(whiteShip.getClass().getSimpleName()); // WhiteShip

    // java 설정
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
    ShipFactory bean = applicationContext.getBean(ShipFactory.class);
    System.out.println(bean); // com.design.pattern.CreationalPatterns.abstractfactory._03_java.ShipFactory@1807e3f6

    Ship shipBean = applicationContext.getBean(Ship.class);
    System.out.println(shipBean);

  }

}
