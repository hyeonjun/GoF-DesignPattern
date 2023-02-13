package com.design.pattern.CreationalPatterns.singleton;

public class Singleton4 {

  private static volatile Singleton4 instance;

  private Singleton4() {
  }

  public static Singleton4 getInstance() {
    if (instance == null) {
      synchronized (Singleton4.class) { // class lock
        if (instance == null) {
          instance = new Singleton4();
        }
      }
    }
    return instance;
  }
}
