package com.design.pattern.CreationalPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class EnumSerialize {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Singleton6 singleton = Singleton6.INSTANCE;

    Singleton6 singleton1 = null;
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(singleton);
    }

    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      singleton1 = (Singleton6) in.readObject();
    }

    System.out.println(singleton == singleton1);
  }
}
