package design.decorator.coffee;

import design.decorator.material.Material;

public abstract class Coffee extends Material {
  @Override
  public float calculateCost() {
    return super.getPrice();
  }
}