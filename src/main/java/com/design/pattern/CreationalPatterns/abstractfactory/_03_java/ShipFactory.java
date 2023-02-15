package com.design.pattern.CreationalPatterns.abstractfactory._03_java;

import com.design.pattern.CreationalPatterns.factorymethod._02_after.Ship;
import com.design.pattern.CreationalPatterns.factorymethod._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

// FactoryBean: 스프링에서 제공해주는 인터페이스
// 빈을 만들 때 만드는 과정이 new 를 사용하여 만들 수 없고,
// 복잡한 과정을 거쳐야 하는 경우 FactoryBean의 구현체를 만들어서 빈으로 등록한다.
// 그냥 빈으로 등록할 때는 new 또는 static으로 만들 수 있는데,
// 그렇지 않을 경우에는 FactoryBean의 인터페이스를 구현해서
// 빈으로 등록하면 팩토리에서 만들어주는 오브젝트로 빈으로 등록이 된다.
public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() {
        Ship ship = new WhiteShip("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
