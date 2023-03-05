package com.design.pattern.StructuralPatterns.proxy._02_after;

import com.design.pattern.StructuralPatterns.proxy._01_before.GameService;

public class GameServiceProxy extends GameService {

  @Override
  public void startGame() throws InterruptedException {
    long before = System.currentTimeMillis();
    super.startGame();
    long after = System.currentTimeMillis();
    System.out.println(after - before);
  }
}
