package com.design.pattern.CreationalPatterns.factorymethod._02_after;

public class WhiteShip extends Ship {

  public WhiteShip(String name) {
    setName(name);
    setLogo("\uD83D\uDEE5️");
    setColor("white");
  }
}
