package design.factory.case3;

import design.factory.case3.order.*;

public class App {
  public static void main(String[] args) {
    // Use different order class to realize order pizzas made by different stores.
    // new OrderDominoPizza(); // Order pizza from Domino
    new OrderPizzahutPizza(); // Order pizza from Pizzahut
  }
}