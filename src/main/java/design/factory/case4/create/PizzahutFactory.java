package design.factory.case4.create;

import design.factory.case4.pizza.*;

public class PizzahutFactory implements AbsFactory {
  @Override
  public Pizza createPizza(String pizzaType) {
    Pizza pizza = null;
    if (pizzaType.equals("cheese")) {
      pizza = new PizzahutCheesePizza();
    } else if (pizzaType.equals("chicken")) {
      pizza = new PizzahutChickenPizza();
    }
    return pizza;
  }
}