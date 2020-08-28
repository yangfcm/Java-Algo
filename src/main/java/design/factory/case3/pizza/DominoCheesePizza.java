package design.factory.case3.pizza;

public class DominoCheesePizza extends Pizza {
  @Override
  public void prepare() {
    setName("Domino cheese pizza");
    System.out.println("Domino is preparing for cheese pizza");
  }
}