package design.decorator.supplement;

import design.decorator.material.Material;

public class Supplement extends Material {
  private Material coffeeMaterial;

  public Supplement(Material coffeeMaterial) {
    this.coffeeMaterial = coffeeMaterial;
  }

  @Override
  public float calculateCost() {
    // Supplement cost + coffee cost
    return super.getPrice() + coffeeMaterial.calculateCost();
  }

  @Override
  public String getDescription() {
    return super.description + " " + super.getPrice() + " && " + coffeeMaterial.getDescription() + " ";
  }
}