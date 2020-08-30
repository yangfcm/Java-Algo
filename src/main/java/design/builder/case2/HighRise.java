package design.builder.case2;

public class HighRise extends Builder {
  @Override
  public void buildFoundation() {
    System.out.println("Build the foundation of a highrise building");
  }

  @Override
  public void buildBody() {
    System.out.println("Build the body of a highrise building");
  }

  @Override
  public void buildRoof() {
    System.out.println("Build the roof of a highrise building");
  }
}