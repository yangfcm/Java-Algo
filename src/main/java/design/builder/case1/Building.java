package design.builder.case1;

public abstract class Building {
  public abstract void buildFoundation();

  public abstract void buildBody();

  public abstract void buildRoof();

  public void doBuild() {
    buildFoundation();
    buildBody();
    buildRoof();
  }
}