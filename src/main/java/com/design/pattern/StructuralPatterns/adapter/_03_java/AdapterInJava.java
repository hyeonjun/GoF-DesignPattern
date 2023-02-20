package com.design.pattern.StructuralPatterns.adapter._03_java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

  public static void main(String[] args) {
    // collections
    List<String> arr = Arrays.asList("a", "b", "c"); // 넘긴 것은 배열이지만, 받은 것은 리스트
    Enumeration<String> enumeration = Collections.enumeration(arr); // 리스트를 넘겨주면, Enumeration 타입으로 받을 수 있다.
    ArrayList<String> list = Collections.list(enumeration);

    // io
    try(InputStream is = new FileInputStream("input.txt"); // 문자열 -> InputStream
      InputStreamReader isr = new InputStreamReader(is); // InputStream -> InputStreamReader
      BufferedReader reader = new BufferedReader(isr)) { // InputStreamReader -> BufferedReader
      while (reader.ready()) {
        System.out.println(reader.readLine());
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
