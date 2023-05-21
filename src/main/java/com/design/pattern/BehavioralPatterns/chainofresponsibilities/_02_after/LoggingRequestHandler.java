package com.design.pattern.BehavioralPatterns.chainofresponsibilities._02_after;

import com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before.Request;

public class LoggingRequestHandler extends RequestHandler {

  // 로깅 핸들러
  public LoggingRequestHandler() {
  }

  public LoggingRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("로깅");
    super.handle(request);
  }
}
