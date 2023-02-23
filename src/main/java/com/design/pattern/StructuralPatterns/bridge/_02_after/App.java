package com.design.pattern.StructuralPatterns.bridge._02_after;

import com.design.pattern.StructuralPatterns.bridge._01_before.Champion;

public class App {

  public static void main(String[] args) {
    Champion kda아리 = new 아리(new KDA());
    kda아리.skillQ();
    kda아리.skillR();

    Champion poolParty아리 = new 아리(new PoolParty());
    poolParty아리.skillQ();
    poolParty아리.skillR();

  }
}
