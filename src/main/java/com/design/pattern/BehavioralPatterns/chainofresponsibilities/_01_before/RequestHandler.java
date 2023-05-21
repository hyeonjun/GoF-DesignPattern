package com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before;

public class RequestHandler {

  public void handler(Request request) {
    System.out.println(request.getBody());
  }
}
