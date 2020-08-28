package design.factory.case3.pizza;

public class PizzahutCheesePizza extends Pizza {

  @Override
  public void prepare() {
    setName("Pizzahut chicken pizza");
    System.out.println("Pizzahut is preparing for chicken pizza");
  }
}