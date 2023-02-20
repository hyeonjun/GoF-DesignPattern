package com.design.pattern.StructuralPatterns.adapter._02_after.createclass;

import com.design.pattern.StructuralPatterns.adapter._02_after.security.LoginHandler;
import com.design.pattern.StructuralPatterns.adapter._02_after.security.UserDetailsService;

public class App {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
    LoginHandler handler = new LoginHandler(userDetailsService);
    String login = handler.login("test", "test");
    System.out.println(login);
  }

}
