package design.template.SoyMilk;

public class PeanutSweetSoyMilk extends SoyMilk {

  @Override
  public void getMaterial() {
    System.out.println("Get peanut");
  }

  @Override
  public void getIngredient() {
    System.out.println("Add sugar");
  }
}
