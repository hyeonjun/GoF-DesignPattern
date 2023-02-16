package com.design.pattern.CreationalPatterns.builder._02_after;

import com.design.pattern.CreationalPatterns.builder._01_before.TourPlan;
import java.time.LocalDate;

public class TourDirector {

  private TourPlanBuilder tourPlanBuilder;

  public TourDirector(TourPlanBuilder tourPlanBuilder) {
    this.tourPlanBuilder = tourPlanBuilder;
  }

  public TourPlan cancunTrip() {
    return tourPlanBuilder.newInstance()
      .title("칸쿤 여행") // chain을 걸 수 있는 이유는 해당 메소드들이 전부 같은 리턴 타입이기 때문
      .nightsAndDays(2, 3)
      .startDate(LocalDate.of(2020, 12, 9))
      .whereToStay("리조트")
      .addPlan(0, "체크인 하고 짐 풀기")
      .addPlan(0, "저녁 식사")
      .getPlan();
  }

  public TourPlan longBeachTrip() {
    return tourPlanBuilder.newInstance()
      .title("롱비치")
      .startDate(LocalDate.of(2021, 7, 15))
      .getPlan();
  }
}
