package com.design.pattern.StructuralPatterns.adapter._02_after.implement;

import com.design.pattern.StructuralPatterns.adapter._02_after.security.LoginHandler;

public class App {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    LoginHandler handler = new LoginHandler(accountService);
    String login = handler.login("test", "test");
    System.out.println(login);
  }
}
