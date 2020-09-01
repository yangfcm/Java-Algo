package design.decorator.material;

public abstract class Material {
  public String description;
  private float price = 0.0f;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public abstract float calculateCost();
}