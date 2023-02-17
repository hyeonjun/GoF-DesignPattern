package com.design.pattern.CreationalPatterns.builder._02_after;

import com.design.pattern.CreationalPatterns.builder._01_before.TourPlan;

public class App {

  public static void main(String[] args) {
    TourDirector director1 = new TourDirector(new DefaultTourBuilder());
    TourDirector director2 = new TourDirector(new DefaultTourBuilder());
    TourPlan tourPlan = director1.cancunTrip();
    TourPlan tourPlan1 = director2.longBeachTrip();

    System.out.println(tourPlan);
    System.out.println(tourPlan1);
  }

}
