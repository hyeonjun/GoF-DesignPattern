package com.design.pattern.CreationalPatterns.abstractfactory._02_after;

public class WhitePartsProFactory implements ShipPartsFactory {

  @Override
  public Anchor createAnchor() {
    return new WhiteAnchorPro();
  }

  @Override
  public Wheel createWheel() {
    return new WhiteWheelPro();
  }
}
