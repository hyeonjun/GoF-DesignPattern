package com.design.pattern.CreationalPatterns.factorymethod._02_after;

public class Client {

  public static void main(String[] args) {
    Client client = new Client();
    client.print(new WhiteShipFactory(), "Whiteship", "keesun@mail.com");
    client.print(new BlackShipFactory(), "Blackship", "keesun@mail.com");
  }

  private void print(ShipFactory shipFactory, String name, String email) {
    System.out.println(shipFactory.orderShip(name, email));
  }

}
