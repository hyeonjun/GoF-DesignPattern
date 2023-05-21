package com.design.pattern.BehavioralPatterns.interpreter._02_after;

import java.util.Map;

public class App {

  public static void main(String[] args) {
    PostfixExpression expression1 = PostfixParser.parse1("xyz+-a+");
    int result1 = expression1.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
    System.out.println(result1);

    PostfixExpression expression2 = PostfixParser.parse2("xyz+-a+");
    int result2 = expression2.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
    System.out.println(result2);
  }
}
