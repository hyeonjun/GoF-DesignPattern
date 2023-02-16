package com.design.pattern.CreationalPatterns.builder._03_java;

public class StringBuilderExample {

  public static void main(String[] args) {
    // StringBuilder vs StringBuffer
    // StringBuilder => synchronized를 사용하지 않음, StringBuffer => 사용함
    StringBuilder stringBuilder = new StringBuilder();
    String result = stringBuilder.append("whiteship").append("spring").toString();
    System.out.println(result);
  }
}
