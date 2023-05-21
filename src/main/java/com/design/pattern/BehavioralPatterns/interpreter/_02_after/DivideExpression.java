package com.design.pattern.BehavioralPatterns.interpreter._02_after;

import java.util.Map;

public class DivideExpression implements PostfixExpression {

  private PostfixExpression left, right;

  public DivideExpression(PostfixExpression left, PostfixExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(Map<Character, Integer> context) {
    return left.interpret(context) / right.interpret(context);
  }
}
