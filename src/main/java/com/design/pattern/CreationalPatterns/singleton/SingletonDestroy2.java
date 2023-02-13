package com.design.pattern.CreationalPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroy2 {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Singleton5 singleton = Singleton5.getInstance();
    Singleton5 singleton1 = null;
    // try-resource
    // 직렬화
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
      out.writeObject(singleton);
    }

    // 역직렬화 -> 반드시 생성자를 통해 인스턴스를 새롭게 만들어줌
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
      singleton1 = (Singleton5) in.readObject();
    }

    System.out.println(singleton == singleton1); // false
  }
}
