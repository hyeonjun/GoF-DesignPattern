package com.design.pattern.CreationalPatterns.singleton;

public class App {

  public static void main(String[] args) {

    Settings settings = new Settings();
    Settings settings1 = new Settings();
    System.out.println(settings.equals(settings1)); // false

    // SettingSingleton singleton = new SettingSingleton(); 불가능
    Singleton1 singleton = Singleton1.getInstance();
    Singleton1 singleton1 = Singleton1.getInstance();
    System.out.println(singleton.equals(singleton1)); // true

  }
}
