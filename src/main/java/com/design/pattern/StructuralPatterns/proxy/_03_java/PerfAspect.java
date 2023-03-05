package com.design.pattern.StructuralPatterns.proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect // 빈으로 등록해야하기 때문에 Component를 사용
@Component
public class PerfAspect { // 스프링 AOP

  @Around("bean(gameService)") // 스프링 빈에만 적용할 수도 있다.
  public void timeStamp(ProceedingJoinPoint joinPoint) throws Throwable {
    // ProceedingJoinPoint: aspect가 적용되는 지점을 일컫는 레퍼런스
    long before = System.currentTimeMillis();
    joinPoint.proceed();
    System.out.println(System.currentTimeMillis() - before);
  }
}
