package com.design.pattern.CreationalPatterns.prototype._03_java;

import com.design.pattern.CreationalPatterns.prototype._02_after.GithubIssue;
import com.design.pattern.CreationalPatterns.prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

  public static void main(String[] args) {
    GithubRepository repository = new GithubRepository();
    repository.setUser("whiteship");
    repository.setName("live-study");

    GithubIssue issue = new GithubIssue(repository);
    issue.setId(1);
    issue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    // GithubIssue -> GithubIssueData
    GitHubIssueData gitHubIssueData = new GitHubIssueData();
    gitHubIssueData.setId(issue.getId());
    gitHubIssueData.setTitle(issue.getTitle());
    gitHubIssueData.setRepositoryName(issue.getRepository().getName());
    gitHubIssueData.setRepositoryUser(issue.getRepository().getUser());
    System.out.println(gitHubIssueData);

    // ModelMapper
    ModelMapper modelMapper = new ModelMapper();
    GitHubIssueData data = modelMapper.map(issue, GitHubIssueData.class);
    System.out.println(data);

  }

}
