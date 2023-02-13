package com.design.pattern.CreationalPatterns.singleton;

public class RuntimeExample {

  public static void main(String[] args) {
    // Runtime 이란 실행 환경을 의미함
    // Runtime 인스턴스는 싱글톤 패턴을 통해서만 얻을 수 있다.
    // => new 키워드로는 생성 불가능
    Runtime runtime = Runtime.getRuntime();
    System.out.println(runtime.maxMemory());
    System.out.println(runtime.freeMemory());
  }

}
