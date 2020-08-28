package design.factory.case2.pizza;

public abstract class Pizza {
  protected String name;

  // Prepare ingredients for pizza
  // Different ingredients make different pizza
  public abstract void prepare();

  public void bake() {
    System.out.println("Baking " + name);
  }

  public void cut() {
    System.out.println("Cutting " + name);
  }

  public void pack() {
    System.out.println("Packing " + name);
  }

  public void setName(String name) {
    this.name = name;
  }
}