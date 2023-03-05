package com.design.pattern.StructuralPatterns.proxy._03_java;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(App.class);
    app.setWebApplicationType(WebApplicationType.NONE);
    app.run(args);
  }

  @Bean
  public ApplicationRunner applicationRunner(GameService gameService) {
    // GameService: Proxy Bean
    // GameService는 Interface로 만들어지는 것이 아니기 때문에
    // 상속을 사용하여 만들어야하는데, 이때 CGLIB를 사용하여 만들게 된다.
    return args -> gameService.startGame();
  }
}
