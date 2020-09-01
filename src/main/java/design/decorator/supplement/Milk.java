package design.decorator.supplement;

import design.decorator.material.Material;

public class Milk extends Supplement {
  public Milk(Material coffee) {
    super(coffee);
    setDescription("Milk supplement");
    setPrice(1.0f);
  }
}