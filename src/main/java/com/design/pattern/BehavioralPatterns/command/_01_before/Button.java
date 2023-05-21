package com.design.pattern.BehavioralPatterns.command._01_before;

public class Button { // invoker

  private Light light; // receiver

  public Button(Light light) {
    this.light = light;
  }

  public void press() {
    light.off();
  }

  public static void main(String[] args) {
    Button button = new Button(new Light());
    button.press();
    button.press();
    button.press();
    button.press();
  }
}
