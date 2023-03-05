package com.design.pattern.StructuralPatterns.proxy._02_after;

public class Client {

  public static void main(String[] args) throws InterruptedException {
    GameService gameService = new GameServiceProxy(new DefaultGameService());
    gameService.startGame();
  }
}
