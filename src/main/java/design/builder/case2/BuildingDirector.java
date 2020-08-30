package design.builder.case2;

public class BuildingDirector {
  Builder builder = null;

  public BuildingDirector(Builder builder) {
    this.builder = builder;
  }

  public void setBuilding(Builder builder) {
    this.builder = builder;
  }

  public Building buildBuilding() {
    builder.buildFoundation();
    builder.buildBody();
    builder.buildRoof();
    return builder.doBuild();
  }

}