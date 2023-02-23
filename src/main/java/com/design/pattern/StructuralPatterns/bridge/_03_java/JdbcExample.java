package com.design.pattern.StructuralPatterns.bridge._03_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName("org.h2.Driver"); // 클래스 로딩

    try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
      String sql = "CREATE TABLE ACCOUNT"
        + " (id INTEGER not NULL,"
        + " email VARCHAR(255),"
        + " password VARCHAR(255),"
        + " PRIMARY KEY ( id ))";

      Statement statement = conn.createStatement();
      statement.execute(sql);

//      PreparedStatement preparedStatement = conn.prepareStatement(sql);
//      ResultSet resultSet = statement.executeQuery(sql); // 결과가 있는 경우의 sql은 ResultSet 사용

      /*
      DriverManager, Connection, Statement(PreparedStatement, ResultSet): 추상화
      Driver: 구현체
       */
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }

}
