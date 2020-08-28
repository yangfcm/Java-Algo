package design.factory.case4.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.factory.case4.create.AbsFactory;
import design.factory.case4.pizza.*;

public class OrderPizza {
  AbsFactory factory;

  private void setFactory(AbsFactory factory) {
    this.factory = factory;
    Pizza pizza = null;
    String pizzaType;
    do {
      pizzaType = readPizzaType();
      pizza = this.factory.createPizza(pizzaType);
      if (pizza == null) {
        System.out.println("Invalid input, try again.");
        continue;
      }
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.pack();
    } while (true);
  }

  public OrderPizza(AbsFactory factory) {
    this.setFactory(factory);
  }

  private String readPizzaType() {
    try {
      BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("input pizza type: ");
      String str = strin.readLine();
      return str;
    } catch (IOException e) {
      e.printStackTrace();
      return "";
    }
  }
}