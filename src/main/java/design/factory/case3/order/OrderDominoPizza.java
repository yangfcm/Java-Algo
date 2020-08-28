package design.factory.case3.order;

import design.factory.case3.pizza.*;

public class OrderDominoPizza extends OrderPizza {
  @Override
  Pizza doOrderPizza(String pizzaType) {
    Pizza pizza = null;
    if (pizzaType.equals("cheese")) {
      pizza = new DominoCheesePizza();
    } else if (pizzaType.equals("chicken")) {
      pizza = new DominoChickenPizza();
    }
    return pizza;
  }
}