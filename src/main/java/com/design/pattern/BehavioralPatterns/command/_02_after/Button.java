package com.design.pattern.BehavioralPatterns.command._02_after;

import com.design.pattern.BehavioralPatterns.command._01_before.Game;
import com.design.pattern.BehavioralPatterns.command._01_before.Light;
import java.util.Stack;

public class Button {

  private Stack<Command> commands = new Stack<>();

  public void press(Command command) {
    command.execute();
    commands.push(command);
  }

  public void undo() {
    if (!commands.isEmpty()) {
      Command command = commands.pop();
      command.undo();
    }
  }

  public static void main(String[] args) {
    Button button = new Button();
    button.press(new GameStartCommand(new Game()));
    button.press(new LightOnCommand(new Light()));
    button.undo();
    button.undo();
  }

}
