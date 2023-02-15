package com.design.pattern.CreationalPatterns.abstractfactory._02_after;

import com.design.pattern.CreationalPatterns.abstractfactory._01_before.WhiteAnchor;
import com.design.pattern.CreationalPatterns.abstractfactory._01_before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {


  @Override
  public Anchor createAnchor() {
    return new WhiteAnchor();
  }

  @Override
  public Wheel createWheel() {
    return new WhiteWheel();
  }
}
