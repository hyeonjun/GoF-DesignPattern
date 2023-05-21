package com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before;

public class Client {

  public static void main(String[] args) {
    Request request = new Request("무궁화 꽃이 피었습니다.");
    RequestHandler requestHandler = new LoggingRequestHandler();
    requestHandler.handler(request);

    // 클라이언트가 어떤 handler를 사용해야하는지 알아야 함
    RequestHandler requestHandler1 = new AuthRequestHandler();
    requestHandler1.handler(request);

    // 로깅과 인증 둘 다 하려면?
    // 클라이언트가 어떤 필터를 사용해야하는지 모르게끔 하는 것이 책임 연쇄 패턴

  }
}
