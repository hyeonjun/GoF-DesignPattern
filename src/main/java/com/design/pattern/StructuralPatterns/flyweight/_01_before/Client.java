package com.design.pattern.StructuralPatterns.flyweight._01_before;

public class Client {

    public static void main(String[] args) {
        // 편집기에 글을 많이 쓸수록 글자가 많아질 것이고,
        // 그만큼 인스턴스가 사용하는 메모리의 양이 최적화되지 않으면 편집기의 성능에 영향을 미치게 된다.
        Character c1 = new Character('h', "white", "Nanum", 12);
        Character c2 = new Character('e', "white", "Nanum", 12);
        Character c3 = new Character('l', "white", "Nanum", 12);
        Character c4 = new Character('l', "white", "Nanum", 12);
        Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
