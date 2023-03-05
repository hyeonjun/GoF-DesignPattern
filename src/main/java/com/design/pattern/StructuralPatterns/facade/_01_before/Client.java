package com.design.pattern.StructuralPatterns.facade._01_before;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {

    // 의존성이 tight 할수록 해당 코드를 변경하기도 어렵고, 변경되어야 하는 이유도 많아지고, 테스트하는데도 힘들다.
    // 그래서 가급적 유연한 구조를 만들어야 한다.
    // 현재 아래 코드는 가장 간단하게 구현된 메일 전송 로직인데도 불구하고, 많은 의존성을 가지고 있다.
    public static void main(String[] args) {
        String to = "sender@send.com";
        String from = "receiver@receive.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties(); // 의존성 1
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties); // 의존성 2

        try {
            MimeMessage message = new MimeMessage(session);  // 의존성 3
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail from Java Program");
            message.setText("message");

            Transport.send(message); // 의존성 4
        } catch (MessagingException e) { // 의존성 5
            e.printStackTrace();
        }
    }
}
