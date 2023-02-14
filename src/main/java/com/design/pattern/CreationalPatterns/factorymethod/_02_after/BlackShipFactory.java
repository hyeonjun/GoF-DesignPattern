package com.design.pattern.CreationalPatterns.factorymethod._02_after;

public class BlackShipFactory extends DefaultShipFactory {


  @Override
  public Ship createShip(String name) {
    return new BlackShip(name);
  }
}