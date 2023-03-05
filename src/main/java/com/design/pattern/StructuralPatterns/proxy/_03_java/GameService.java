package com.design.pattern.StructuralPatterns.proxy._03_java;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

  @Transactional // Spring AOP
  public void startGame() {
    System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
  }
}
