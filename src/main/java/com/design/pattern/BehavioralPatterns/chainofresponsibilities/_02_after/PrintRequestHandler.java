package com.design.pattern.BehavioralPatterns.chainofresponsibilities._02_after;

import com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before.Request;

public class PrintRequestHandler extends RequestHandler {

  // 출력만 하는 핸들러
  public PrintRequestHandler() {
  }

  public PrintRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println(request.getBody());
    super.handle(request);
  }
}
