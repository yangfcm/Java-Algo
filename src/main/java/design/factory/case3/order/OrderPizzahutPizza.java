package design.factory.case3.order;

import design.factory.case3.pizza.*;

public class OrderPizzahutPizza extends OrderPizza {
  @Override
  Pizza doOrderPizza(String pizzaType) {
    Pizza pizza = null;
    if (pizzaType.equals("cheese")) {
      pizza = new PizzahutCheesePizza();
    } else if (pizzaType.equals("chicken")) {
      pizza = new PizzahutCheesePizza();
    }
    return pizza;
  }
}