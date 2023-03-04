package com.design.pattern.StructuralPatterns.decorator._03_java;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

public class DecoratorInSpring {

  public static void main(String[] args) {
    // 빈 설정 데코레이터
    BeanDefinitionDecorator beanDefinitionDecorator;

    // 웹플럭스 HTTP 요청/응답 데코레이터
    // ServerHttpRequest를 커스터마이징할 수 있는 데코레이터
    // 요청에 대해 로깅이나 의심스러운 요청일 경우 응답하지 않는 등을 할 수 있음
    ServerHttpRequestDecorator httpRequestDecorator;
    ServerHttpResponseDecorator httpResponseDecorator;
  }
}
