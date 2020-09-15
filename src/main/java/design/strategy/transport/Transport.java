package design.strategy.transport;

public abstract class Transport {
  FlyBehavior flyBehavior;
  TravelBehavior travelBehavior;

  public Transport() {
  }

  public abstract void display();

  public void fly() {
    if (flyBehavior == null) {
      System.out.println("Not sure it can fly");
    }
    flyBehavior.fly();
  }

  public void travel() {
    if (travelBehavior == null) {
      System.out.println("Not sure its travel status");
    }
    travelBehavior.travel();
  }

}
