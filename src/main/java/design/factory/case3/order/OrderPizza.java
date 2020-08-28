package design.factory.case3.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import design.factory.case3.pizza.*;

public abstract class OrderPizza {

  abstract Pizza doOrderPizza(String pizzaType); // Implementation of the method is in child class.

  public OrderPizza() {
    Pizza pizza = null;
    String pizzaType;
    do {
      pizzaType = readPizzaType();
      pizza = doOrderPizza(pizzaType);
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