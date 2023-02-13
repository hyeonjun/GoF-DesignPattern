package com.design.pattern.CreationalPatterns.singleton;

import java.io.Serializable;

public class Singleton5 implements Serializable {

  private Singleton5() {
  }

  private static class SettingsHolder {
    private static final Singleton5 SINGLETON = new Singleton5();
  }

  public static Singleton5 getInstance() {
    return SettingsHolder.SINGLETON;
  }

  protected Object readResolve() {
    return getInstance();
  }
}
