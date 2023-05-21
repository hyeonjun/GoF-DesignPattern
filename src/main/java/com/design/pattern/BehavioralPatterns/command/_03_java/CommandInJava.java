package com.design.pattern.BehavioralPatterns.command._03_java;

import com.design.pattern.BehavioralPatterns.command._01_before.Game;
import com.design.pattern.BehavioralPatterns.command._01_before.Light;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

  public static void main(String[] args) {
    Light light = new Light();
    Game game = new Game();
    // 스레드 풀 생성
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    executorService.submit(light::on); // 메소드 레퍼런스
    executorService.submit(game::start);
    executorService.submit(game::end);
    executorService.submit(light::off);
    executorService.shutdown();
  }
}
