package com.design.pattern.StructuralPatterns.decorator._02_after;

public class Client {

  // DIP(Dependency Inversion Principal, 의존성 역전 원리)
  // 클라이언트가 Interface 타입인 CommentService를 사용함
  private CommentService commentService;

  public Client(CommentService commentService) {
    this.commentService = commentService;
  }

  public void writeComment(String comment) {
    commentService.addComment(comment);
  }
}
