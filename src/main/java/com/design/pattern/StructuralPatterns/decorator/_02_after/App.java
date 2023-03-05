package com.design.pattern.StructuralPatterns.decorator._02_after;

public class App {

  private static boolean enableSpamFilter = false;
  private static boolean enableTrimming = true;

  public static void main(String[] args) {
    CommentService commentService = new DefaultCommentService();

    if (enableSpamFilter) { // DefaultCommentService 를 SpamFilteringCommentDecorator 로 감싼다(Wrapper)
      commentService = new SpamFilteringCommentDecorator(commentService);
    }

    if (enableTrimming) { // DefaultCommentService 또는 SpamFilteringCommentDecorator 를 TrimmingCommentDecorator 로 감싼다(Wrapper)
      commentService = new TrimmingCommentDecorator(commentService);
    }

    Client client = new Client(commentService);
    client.writeComment("오징어게임");
    client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
    client.writeComment("http://whiteship.me");
  }
}
