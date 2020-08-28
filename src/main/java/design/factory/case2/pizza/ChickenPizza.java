package design.factory.case2.pizza;

public class ChickenPizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("Prepare for chicken pizza");
  }
}