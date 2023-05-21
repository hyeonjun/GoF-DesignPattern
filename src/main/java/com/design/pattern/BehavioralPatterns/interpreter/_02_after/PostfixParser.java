package com.design.pattern.BehavioralPatterns.interpreter._02_after;

import java.util.Stack;

public class PostfixParser {

  public static PostfixExpression parse1(String expression) {
    Stack<PostfixExpression> stack = new Stack<>();
    for (char c : expression.toCharArray()) {
      stack.push(getExpression1(c, stack));
    }
    return stack.pop();
  }

  public static PostfixExpression parse2(String expression) {
    Stack<PostfixExpression> stack = new Stack<>();
    for (char c : expression.toCharArray()) {
      stack.push(getExpression2(c, stack));
    }
    return stack.pop();
  }

  private static PostfixExpression getExpression1(char c, Stack<PostfixExpression> stack) {
    switch (c) {
      case '+':
        return new PlusExpression(stack.pop(), stack.pop());
      case '-':
        PostfixExpression right = stack.pop();
        PostfixExpression left = stack.pop();
        return new MinusExpression(left, right);
      default:
        return new VariableExpression(c);
    }
  }

  private static PostfixExpression getExpression2(char c, Stack<PostfixExpression> stack) {
    switch (c) {
      case '+':
        return PostfixExpression.plus(stack.pop(), stack.pop());
      case '-':
        PostfixExpression right = stack.pop();
        PostfixExpression left = stack.pop();
        return PostfixExpression.minus(left, right);
      default:
        return PostfixExpression.variable(c);
    }
  }
}
