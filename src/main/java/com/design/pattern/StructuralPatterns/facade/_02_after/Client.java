package com.design.pattern.StructuralPatterns.facade._02_after;

public class Client {

  public static void main(String[] args) {
    EmailSettings emailSettings = new EmailSettings();
    emailSettings.setHost("127.0.0.1");

    EmailMessage emailMessage = new EmailMessage();
    emailMessage.setFrom("receiver@receive.com");
    emailMessage.setTo("sender@send.com");
    emailMessage.setSubject("Test Mail from Java Program");
    emailMessage.setText("message");

    EmailSender emailSender = new EmailSender(emailSettings);
    emailSender.sendEmail(emailMessage);
  }
}
