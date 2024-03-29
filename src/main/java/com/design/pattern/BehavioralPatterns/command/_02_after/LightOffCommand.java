package com.design.pattern.BehavioralPatterns.command._02_after;

import com.design.pattern.BehavioralPatterns.command._01_before.Light;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    new LightOnCommand(this.light).execute();
  }
}
