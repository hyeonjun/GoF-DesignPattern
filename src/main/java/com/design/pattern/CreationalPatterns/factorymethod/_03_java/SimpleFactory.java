package com.design.pattern.CreationalPatterns.factorymethod._03_java;

import com.design.pattern.CreationalPatterns.factorymethod._02_after.BlackShip;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.WhiteShip;

public class SimpleFactory { // 단순한 팩토리 패턴 -> Calender 등

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip(name);
        } else if (name.equals("blackship")) {
            return new BlackShip(name);
        }

        throw new IllegalArgumentException();
    }
}
