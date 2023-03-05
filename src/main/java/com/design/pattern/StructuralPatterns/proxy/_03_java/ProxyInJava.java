package com.design.pattern.StructuralPatterns.proxy._03_java;

import com.design.pattern.StructuralPatterns.proxy._02_after.DefaultGameService;
import com.design.pattern.StructuralPatterns.proxy._02_after.GameService;
import java.lang.reflect.Proxy;

public class ProxyInJava {

  public static void main(String[] args) {
    ProxyInJava proxyInJava = new ProxyInJava();
    proxyInJava.dynamicProxy();
  }

  private void dynamicProxy() {
    GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
    gameServiceProxy.startGame();
  }

  // 동적으로 위 메소드의 로직이 수행될 때 프록시 인스턴스가 생성된다.
  private GameService getGameServiceProxy(GameService target) {
    // java reflection
    return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
      new Class[]{GameService.class}, (proxy, method, args) -> { // invocationHandler
        System.out.println("Start Dynamic Proxy");
        method.invoke(target, args); // target => DefaultGameService
        System.out.println("End Dynamic Proxy");
        return null;
      });
  }
}
