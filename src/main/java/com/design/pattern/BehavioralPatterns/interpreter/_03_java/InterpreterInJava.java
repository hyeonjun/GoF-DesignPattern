package com.design.pattern.BehavioralPatterns.interpreter._03_java;

import java.util.regex.Pattern;

public class InterpreterInJava {

  public static void main(String[] args) { // 정규표현식
    System.out.println(Pattern.matches(".pr...", "spring"));
    System.out.println(Pattern.matches("[a-z]{6}", "spring"));
    System.out.println(Pattern.matches("white[a-z]{4}[0-9]{4}", "whiteship2000"));
    System.out.println(Pattern.matches("\\d", "1")); // one digit
    System.out.println(Pattern.matches("\\D", "a")); // one non-digit
  }
}
