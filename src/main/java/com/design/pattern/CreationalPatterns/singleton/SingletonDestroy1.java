package com.design.pattern.CreationalPatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroy1 {

  public static void main(String[] args)
    throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Singleton5 singleton = Singleton5.getInstance();
    Singleton5 singleton1 = Singleton5.getInstance();

    Constructor<Singleton5> constructor = Singleton5.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Singleton5 singleton2 = constructor.newInstance();

    System.out.println(singleton == singleton1); // true
    System.out.println(singleton == singleton2); // false
  }

}
