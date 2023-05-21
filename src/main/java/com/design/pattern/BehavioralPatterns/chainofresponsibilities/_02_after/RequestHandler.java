package com.design.pattern.BehavioralPatterns.chainofresponsibilities._02_after;

import com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before.Request;

public abstract class RequestHandler { // default 메소드가 있는 interface를 사용하여 추상 클래스를 추가하여 사용할 수도 있음

  private RequestHandler nextHandler;

  protected RequestHandler() {
  }

  public RequestHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handle(Request request) {
    if (nextHandler != null) { // 다음 핸들러가 있을 수도 없을 수도 있기 때문에 null 체크를 해줘야 함
      nextHandler.handle(request);
    }
  }
}
