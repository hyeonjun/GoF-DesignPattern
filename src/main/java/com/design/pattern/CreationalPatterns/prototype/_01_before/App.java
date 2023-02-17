package com.design.pattern.CreationalPatterns.prototype._01_before;

public class App {

  public static void main(String[] args) {
    GithubRepository repository = new GithubRepository();
    repository.setUser("whiteship");
    repository.setName("live-study");

    GithubIssue issue = new GithubIssue(repository);
    issue.setId(1);
    issue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    String url = issue.getUrl();
    System.out.println(url);

    // 현재는 new 키워드를 사용해서 또 하나 더 인스턴스를 생성해서 써야 함
    GithubIssue issue1 = new GithubIssue(repository);
    issue1.setId(2);
    issue1.setTitle("2주차 과제");

    // clone 을 구현했다면
    // GithubIssue clone = issue.clone();
    // 주의
    // 1. clone != issue -> true => clone은 새로운 인스턴스임
    // 2. clone.equals(issue) -> true => 값은 같아야함
  }
}
