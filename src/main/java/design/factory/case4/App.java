package design.factory.case4;

import design.factory.case4.order.OrderPizza;
import design.factory.case4.create.*;

public class App {
  public static void main(String[] args) {
    // new OrderPizza(new PizzahutFactory());
    new OrderPizza(new DominoFactory());
  }
}