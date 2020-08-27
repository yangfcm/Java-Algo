package design.factory.case1.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.factory.case1.pizza.*;

public class OrderPizza {
  public OrderPizza() {
    Pizza pizza = null;
    String pizzaType;
    do {
      pizzaType = readPizzaType();
      if (pizzaType.equals("cheese")) {
        pizza = new CheesePizza();
        pizza.setName("cheese pizza");
      } else if (pizzaType.equals("chicken")) {
        pizza = new ChickenPizza();
        pizza.setName("chicken pizza");
      } else {
        System.out.println("Invalid input, try again.");
        continue;
      }

      // Output pizza
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