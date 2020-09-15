package design.strategy.transport;

public class Ship extends Transport {

  public Ship() {
    flyBehavior = new CannotFlyBehavior();
    travelBehavior = new TravelSlowBehavior();
  }

  @Override
  public void display() {
    System.out.println("Transport by ship");
  }
}
