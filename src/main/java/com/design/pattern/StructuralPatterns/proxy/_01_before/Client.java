package com.design.pattern.StructuralPatterns.proxy._01_before;

public class Client {

  public static void main(String[] args) throws InterruptedException {
    GameService gameService = new GameService();
    gameService.startGame();
  }
}
