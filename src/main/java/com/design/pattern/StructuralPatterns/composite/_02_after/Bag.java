package com.design.pattern.StructuralPatterns.composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    private List<Component> components = new ArrayList<>(); // Leaf 타입이 아닌 Component 타입을 참조해야한다.

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }


    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
