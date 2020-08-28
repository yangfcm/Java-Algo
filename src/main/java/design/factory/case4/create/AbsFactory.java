package design.factory.case4.create;

import design.factory.case4.pizza.Pizza;

public interface AbsFactory {
  public Pizza createPizza(String pizzaType);
}