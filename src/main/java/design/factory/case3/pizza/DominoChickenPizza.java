package design.factory.case3.pizza;

public class DominoChickenPizza extends Pizza {

  @Override
  public void prepare() {
    setName("Domino chicken pizza");
    System.out.println("Domino is preparing for chicken pizza");
  }
}