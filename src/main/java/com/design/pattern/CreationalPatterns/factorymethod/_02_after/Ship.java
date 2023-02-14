package com.design.pattern.CreationalPatterns.factorymethod._02_after;

public class Ship {

  // 변경에 닫혀 있지 않은 구조
  private String name;

  private String color;

  private String logo;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  @Override
  public String toString() {
    return "Ship{" +
      "name='" + name + '\'' +
      ", color='" + color + '\'' +
      ", logo='" + logo + '\'' +
      '}';
  }
}
