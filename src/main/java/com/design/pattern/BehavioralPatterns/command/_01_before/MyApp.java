package com.design.pattern.BehavioralPatterns.command._01_before;

public class MyApp {

  private Game game; // 직접 적으로 호출하여 커플링이 높음 -> 책임을 분산하여 의존성을 디커플링

  public MyApp(Game game) {
    this.game = game;
  }

  public void press() {
    game.start();
  }

  public static void main(String[] args) {
    Button button = new Button(new Light());
    button.press();
    button.press();
    button.press();
    button.press();
  }
}
