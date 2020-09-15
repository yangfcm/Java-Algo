package design.strategy.transport;

public class TravelSlowBehavior implements TravelBehavior {

  @Override
  public void travel() {
    System.out.println("Traveling slow");
  }

}
