package design.builder.case2;

public class House extends Builder {
  @Override
  public void buildFoundation() {
    System.out.println("Build the foundation of a house");
  }

  @Override
  public void buildBody() {
    System.out.println("Build the body of a house");
  }

  @Override
  public void buildRoof() {
    System.out.println("Build the roof of a house");
  }
}