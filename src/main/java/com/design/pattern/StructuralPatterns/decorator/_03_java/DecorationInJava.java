package com.design.pattern.StructuralPatterns.decorator._03_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;

public class DecorationInJava {

  public static void main(String[] args) {
    // Collections가 제공하는 데코레이터 메소드
    ArrayList list = new ArrayList<>();
    list.add(new Book());

    List books = Collections.checkedList(list, Book.class); // checkedList: 타입 체크 => Book 클래스만 받을 수 있도록 함

    list.add(new Item());
//    books.add(new Item()); // Type casting 에러 발생

    List unmodifiableList = Collections.unmodifiableList(list);
    list.add(new Item());
    unmodifiableList.add(new Book()); // 추가 불가능 -> 에러 발생

    // 서블릿 요청 또는 응답 랩퍼
    // HttpServletReqeust를 확장해서 부가적인 기능을 넣을 수 있음,
    // HttpServletReqeust의 요청 본문을 바꾸거나 로깅 같은것들을 할 수 있음
    HttpServletRequestWrapper requestWrapper;
    HttpServletResponseWrapper responseWrapper; // 마찬가지
  }

  private static class Book {

  }

  private static class Item {

  }
}
