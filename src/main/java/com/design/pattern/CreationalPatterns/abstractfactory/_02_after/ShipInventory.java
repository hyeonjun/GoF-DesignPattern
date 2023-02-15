package com.design.pattern.CreationalPatterns.abstractfactory._02_after;

import com.design.pattern.CreationalPatterns.factorymethod._02_after.Ship;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.ShipFactory;

public class ShipInventory {

  public static void main(String[] args) {
    ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
    Ship ship = shipFactory.createShip("whiteShipPro");
    System.out.println(ship.getAnchor().getClass().getSimpleName()); // WhiteAnchorPro
    System.out.println(ship.getWheel().getClass().getSimpleName()); // WhiteWheelPro
  }

}
