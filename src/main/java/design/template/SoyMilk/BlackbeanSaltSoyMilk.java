package design.template.SoyMilk;

public class BlackbeanSaltSoyMilk extends SoyMilk {
  @Override
  public void getMaterial() {
    System.out.println("Get black bean");
  }

  @Override
  public void getIngredient() {
    System.out.println("Add salt");
  }
}
