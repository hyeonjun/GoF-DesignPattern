package com.design.pattern.CreationalPatterns.prototype._02_after;

public class App {

  public static void main(String[] args) throws CloneNotSupportedException{
    GithubRepository repository = new GithubRepository();
    repository.setUser("whiteship");
    repository.setName("live-study");

    GithubIssue issue = new GithubIssue(repository);
    issue.setId(1);
    issue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    String url = issue.getUrl();
    System.out.println(url);

    // clone 메소드의 리턴타입은 Object이기 때문에 형 변환(캐스팅)을 해줘야 한다
    GithubIssue clone = (GithubIssue) issue.clone();
    System.out.println(clone.getUrl());

    System.out.println(clone != issue); // true
    System.out.println(clone.equals(issue)); // true
    System.out.println(clone.getClass() == issue.getClass()); // true

    // Shallow Copy
    System.out.println(clone.getRepository() == issue.getRepository()); // true
  }
}
