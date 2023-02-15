package com.design.pattern.CreationalPatterns.abstractfactory._01_before;

import com.design.pattern.CreationalPatterns.factorymethod._02_after.DefaultShipFactory;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.Ship;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip(name);
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
