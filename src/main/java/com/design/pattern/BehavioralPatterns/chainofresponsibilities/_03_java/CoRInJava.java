package com.design.pattern.BehavioralPatterns.chainofresponsibilities._03_java;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CoRInJava {
  // 서블릿 필터
  public static void main(String[] args) {
    Filter filter = new Filter() {
      @Override
      public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        // TODO 전처리
        chain.doFilter(request, response);
        // TODO 후처리
      }
    };
  }
}
