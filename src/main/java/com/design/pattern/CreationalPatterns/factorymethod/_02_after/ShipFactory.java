package com.design.pattern.CreationalPatterns.factorymethod._02_after;

public interface ShipFactory {

  default Ship orderShip(String name, String email) {
    validate(name, email);
    prepareFor(name);
    Ship ship = createShip(name);
    sendEmailTo(email, ship);
    return ship;
  }

  Ship createShip(String name);

  private void validate(String name, String email) { // private 메소드는 자바 9부터 가능, 그 아래 버전은 추상 클래스를 만들어서 사용
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("배 이름을 지어주세요.");
    }
    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("연락처를 남겨주세요.");
    }
  }

  private void prepareFor(String name) {
    System.out.println(name + " 만들 준비 중");
  }

  void sendEmailTo(String email, Ship ship);


}
