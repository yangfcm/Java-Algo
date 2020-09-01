package design.decorator.supplement;

import design.decorator.material.Material;

public class Chocolate extends Supplement {
  public Chocolate(Material coffee) {
    super(coffee);
    setDescription("Chocolate supplement");
    setPrice(2.0f);
  }
}