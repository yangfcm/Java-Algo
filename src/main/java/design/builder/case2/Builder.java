package design.builder.case2;

public abstract class Builder {
  protected Building building = new Building();

  public abstract void buildFoundation();

  public abstract void buildBody();

  public abstract void buildRoof();

  public Building doBuild() {
    return building;
  }
}