package com.design.pattern.CreationalPatterns.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

  public static void main(String[] args) {
    // ApplicationContext에 내가 만든 config를 넣어줌
    // 해당 config 파일에 등록했던 bean도 같이 들어감
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    String hello = context.getBean("hello", String.class); // context에 등록했던 빈을 들고옴
    String hello1 = context.getBean("hello", String.class); // 싱글톤 스코프로 들고오기 때문에 같은 인스턴스가 된다.
    System.out.println(hello == hello1); // true
  }
}
