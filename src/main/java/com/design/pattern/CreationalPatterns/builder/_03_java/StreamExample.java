package com.design.pattern.CreationalPatterns.builder._03_java;

import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    Stream.Builder<String> stringBuilder = Stream.builder();
//    Stream<String> names = stringBuilder.add("spring").add("boot").build();
//    Stream<String> names = Stream.builder.add("spring").add("boot").build(); // 불가능
    Stream<Object> names = Stream.builder().add("spring").add("boot").build();

    names.forEach(System.out::println);
  }

}
