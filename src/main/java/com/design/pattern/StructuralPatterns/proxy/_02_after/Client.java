package com.design.pattern.StructuralPatterns.proxy._02_after;

public class Client {

  public static void main(String[] args) throws InterruptedException {
    GameServiceProxy gameServiceProxy = new GameServiceProxy();
    gameServiceProxy.startGame();
  }
}
