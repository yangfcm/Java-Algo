package design.factory.case2.create;

import design.factory.case1.pizza.*;

public class SimpleFactory {
  public Pizza createPizza(String pizzaType) {
    Pizza pizza = null;

    if (pizzaType.equals("cheese")) {
      System.out.println("equal" + pizzaType);
      pizza = new CheesePizza();
      pizza.setName("cheese pizza");
    } else if (pizzaType.equals("chicken")) {
      System.out.println("equal" + pizzaType);
      pizza = new ChickenPizza();
      pizza.setName("chicken pizza");
    }
    return pizza;
  }
}