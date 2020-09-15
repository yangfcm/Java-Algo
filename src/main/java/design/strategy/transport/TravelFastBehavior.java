package design.strategy.transport;

public class TravelFastBehavior implements TravelBehavior {

  @Override
  public void travel() {
    System.out.println("Traveling fast");

  }

}
