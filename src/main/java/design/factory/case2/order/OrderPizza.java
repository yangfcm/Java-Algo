package design.factory.case2.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.factory.case2.create.SimpleFactory;
import design.factory.case1.pizza.*;

public class OrderPizza {
  SimpleFactory simpleFactory;
  Pizza pizza = null;

  public OrderPizza(SimpleFactory simpleFactory) {
    setFactory(simpleFactory);
  }

  public void setFactory(SimpleFactory simpleFactory) {
    String pizzaType = "";
    this.simpleFactory = simpleFactory;
    do {
      pizzaType = readPizzaType();
      pizza = this.simpleFactory.createPizza(pizzaType);
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