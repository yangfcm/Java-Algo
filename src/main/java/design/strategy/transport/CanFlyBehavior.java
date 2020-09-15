package design.strategy.transport;

public class CanFlyBehavior implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can fly well");
  }

}
