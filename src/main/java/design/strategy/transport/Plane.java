package design.strategy.transport;

public class Plane extends Transport {
  public Plane() {
    flyBehavior = new CanFlyBehavior();
    travelBehavior = new TravelFastBehavior();
  }

  @Override
  public void display() {
    System.out.println("Transport by plane");
  }
}
