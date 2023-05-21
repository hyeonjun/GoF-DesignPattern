package com.design.pattern.BehavioralPatterns.chainofresponsibilities._02_after;

import com.design.pattern.BehavioralPatterns.chainofresponsibilities._01_before.Request;

public class Client {

  private RequestHandler requestHandler;

  public Client(RequestHandler requestHandler) {
    this.requestHandler = requestHandler;
  }

  public void doWork() {
    Request request = new Request("이번 놀이는 뽑기입니다.");
    requestHandler.handle(request);
  }

  public static void main(String[] args) {
    // 요청을 보내는 쪽과 받는 쪽의 커풀링이 끊가게(약하게) 만드는 패턴
    RequestHandler chain =
      new AuthRequestHandler(
        new LoggingRequestHandler(
          new PrintRequestHandler())); // 체인처럼 연결
    Client client = new Client(chain);
    client.doWork();
  }
}
