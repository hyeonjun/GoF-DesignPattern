package com.design.pattern.CreationalPatterns.prototype._02_after;

import java.util.Objects;

public class GithubIssue implements Cloneable {

  private int id;

  private String title;

  private GithubRepository repository;

  public GithubIssue(GithubRepository repository) {
    this.repository = repository;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GithubRepository getRepository() {
    return repository;
  }

  public String getUrl() {
    return String.format("https://github.com/%s/%s/issues/%d",
      repository.getUser(),
      repository.getName(),
      this.getId());
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // Deep Copy
    /*
    GithubRepository repository = new GithubRepository();
    repository.setUser(this.repository.getUser());
    repository.setName(this.repository.getName());

    GithubIssue issue = new GithubIssue(repository);
    issue.setId(this.id);
    issue.setTitle(this.title);
    return issue;
    */
    // clone != issue => true
    // clone.equals(issue) => false
    // clone.getClass() == issue.getClass() => true
    // clone.getRepository() == issue.getRepository(); => false
    return super.clone();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubIssue that = (GithubIssue) o;
    return id == that.id && Objects.equals(title, that.title) && Objects.equals(
      repository, that.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, repository);
  }
}
