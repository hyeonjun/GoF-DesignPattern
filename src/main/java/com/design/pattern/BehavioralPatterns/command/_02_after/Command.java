package com.design.pattern.BehavioralPatterns.command._02_after;

public interface Command { // receiver

  void execute(); // ex) runnable -> void run()

  void undo();

}
