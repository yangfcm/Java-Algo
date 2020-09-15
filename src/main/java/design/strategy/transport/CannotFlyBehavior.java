package design.strategy.transport;

public class CannotFlyBehavior implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I cannot fly");
  }

}
