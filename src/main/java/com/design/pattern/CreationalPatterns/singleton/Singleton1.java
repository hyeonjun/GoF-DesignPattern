package com.design.pattern.CreationalPatterns.singleton;

public class Singleton1 {

  private static Singleton1 instance;

  private Singleton1() { // new를 사용해 생성하지 못하도록
  }

  // 글로벌하게 접근하도록 static
  // 하지만 아래 코드는 멀티 스레드 환경에서는 안전하지 않다.
  public static Singleton1 getInstance() {
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }
}
