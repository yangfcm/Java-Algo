package design.factory.case2;

import design.factory.case2.create.SimpleFactory;
import design.factory.case2.order.OrderPizza;

public class App {
  public static void main(String[] args) {
    new OrderPizza(new SimpleFactory());
  }
}