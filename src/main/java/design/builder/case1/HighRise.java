package design.builder.case1;

public class HighRise extends Building {
  @Override
  public void buildFoundation() {
    System.out.println("Set foundation for a highrise building");
  }

  @Override
  public void buildBody() {
    System.out.println("Build a highrise building");

  }

  @Override
  public void buildRoof() {
    System.out.println("Roof a highrise building");

  }
}