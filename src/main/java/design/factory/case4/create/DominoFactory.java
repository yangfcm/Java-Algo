package design.factory.case4.create;

import design.factory.case4.pizza.*;

public class DominoFactory implements AbsFactory {
  @Override
  public Pizza createPizza(String pizzaType) {
    Pizza pizza = null;
    if (pizzaType.equals("cheese")) {
      pizza = new DominoCheesePizza();
    } else if (pizzaType.equals("chicken")) {
      pizza = new DominoChickenPizza();
    }
    return pizza;
  }
}