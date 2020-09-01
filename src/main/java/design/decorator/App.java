package design.decorator;

import design.decorator.coffee.*;
import design.decorator.supplement.*;
import design.decorator.material.Material;

public class App {
  public static void main(String[] args) {

    Material coffeeMaterial = new Espresso();
    System.out.println("Espresso cost: " + coffeeMaterial.calculateCost());
    System.out.println("Espresso description: " + coffeeMaterial.getDescription());

    var order1 = new Milk(coffeeMaterial); // Coffee + milk
    System.out.println("Espresso + milk cost: " + order1.calculateCost());
    System.out.println("Espresso + milk description: " + order1.getDescription());

    var order2 = new Chocolate(order1); // Coffee + milk + chocolate
    System.out.println("Espresso + milk + chocolate cost: " + order2.calculateCost());
    System.out.println("Espresso + milk + chocolate description: " + order2.getDescription());

    var order3 = new Chocolate(order2); // Coffee + milk + chocolate
    System.out.println("Espresso + milk + chocolatex2 cost: " + order3.calculateCost());
    System.out.println("Espresso + milk + chocolatex2 description: " + order3.getDescription());

  }
}