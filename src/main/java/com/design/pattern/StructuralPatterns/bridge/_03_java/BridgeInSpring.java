package com.design.pattern.StructuralPatterns.bridge._03_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeInSpring {

  public static void main(String[] args) {
    MailSender mailSender = new JavaMailSenderImpl();

    PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();

    // 구체적인 부분의 interface 계층 : MailSender, PlatformTransactionManager
    // implentation의 구현체들: JavaMailSenderImpl, JdbcTransactionManager
    // PlatformTransactionManager의 추상화 계층: TransactionTemplate
  }
}
