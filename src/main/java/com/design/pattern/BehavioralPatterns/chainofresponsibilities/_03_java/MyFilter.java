package com.design.pattern.BehavioralPatterns.chainofresponsibilities._03_java;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/hello") // 해당 url에 필터 적용
public class MyFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {
    System.out.println("게임에 참하신 여러분 모두 진심으로 환영합니다.");
    chain.doFilter(request, response);
    System.out.println("꽝!");
  }
}
