package design.factory.case1.pizza;

public class CheesePizza extends Pizza {
  @Override
  public void prepare() {
    System.out.println("Prepare for cheese pizza");
  }
}