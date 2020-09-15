package design.strategy;

import design.strategy.transport.*;

public class App {
  public static void main(String[] args) {
    var plane = new Plane();
    plane.display();
    plane.fly();
    plane.travel();

    var ship = new Ship();
    ship.display();
    ship.fly();
    ship.travel();
  }
}
