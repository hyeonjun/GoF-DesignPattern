package com.design.pattern.BehavioralPatterns.chainofresponsibilities._02_after;


import com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

  // 인증 핸들러
  public AuthRequestHandler() {
  }

  public AuthRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("인증이 되었는가?");
    super.handle(request);
  }
}
