package design.builder.case1;

public class House extends Building {
  @Override
  public void buildFoundation() {
    System.out.println("Set foundation for a house");
  }

  @Override
  public void buildBody() {
    System.out.println("Build a house");
  }

  @Override
  public void buildRoof() {
    System.out.println("Roof a house");
  }
}