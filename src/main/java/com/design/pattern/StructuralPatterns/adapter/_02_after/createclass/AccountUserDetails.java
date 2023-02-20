package com.design.pattern.StructuralPatterns.adapter._02_after.createclass;

import com.design.pattern.StructuralPatterns.adapter._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

  private Account account;

  public AccountUserDetails(Account account) {
    this.account = account;
  }

  @Override
  public String getUsername() {
    return this.account.getName();
  }

  @Override
  public String getPassword() {
    return this.account.getPassword();
  }
}
