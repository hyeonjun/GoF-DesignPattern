package com.design.pattern.CreationalPatterns.abstractfactory._02_after;

import com.design.pattern.CreationalPatterns.abstractfactory._01_before.WhiteAnchor;
import com.design.pattern.CreationalPatterns.abstractfactory._01_before.WhiteWheel;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.DefaultShipFactory;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.Ship;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip(name);
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
