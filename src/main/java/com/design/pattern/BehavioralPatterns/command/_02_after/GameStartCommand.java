package com.design.pattern.BehavioralPatterns.command._02_after;

import com.design.pattern.BehavioralPatterns.command._01_before.Game;

public class GameStartCommand implements Command {

  private Game game;

  public GameStartCommand(Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.start();
  }

  @Override
  public void undo() {
    new GameEndCommand(this.game).execute();
  }
}
