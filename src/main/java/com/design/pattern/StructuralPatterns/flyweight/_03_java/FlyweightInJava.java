package com.design.pattern.StructuralPatterns.flyweight._03_java;

public class FlyweightInJava {

  public static void main(String[] args) {
    Integer i1= Integer.valueOf(10); // 자주 사용되는 값들(-128 ~ 127)을 캐싱을 한다고 함
    Integer i2= Integer.valueOf(10);
    System.out.println(i1.equals(i2)); // true
    System.out.println(i1 == i2); // true => 캐싱을 하고 있기 때문에 같은 주소값을 가짐

    Integer i3 = Integer.valueOf(100000);
    Integer i4 = Integer.valueOf(100000);
    System.out.println(i3.equals(i4));
    System.out.println(i3 == i4); // false
  }
}
