package com.design.pattern.StructuralPatterns.composite._02_after;

public class Item implements Component{

    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override // 컴파일 타임에 해당 메서드에 상속받은 메소드가 맞는지 시그니처를 확인해줌. 그래서 붙여주는 것이 좋다.
    public int getPrice() {
        return this.price;
    }
}
