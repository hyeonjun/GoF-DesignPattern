package com.design.pattern.CreationalPatterns.factorymethod._02_after;

public class WhiteShipFactory extends DefaultShipFactory {

  @Override
  public Ship createShip(String name) {
    return new WhiteShip(name);
  }

}
