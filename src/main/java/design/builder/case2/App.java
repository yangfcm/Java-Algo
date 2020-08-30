package design.builder.case2;

public class App {
  public static void main(String[] args) {
    House house = new House();
    BuildingDirector buildingHouseDirector = new BuildingDirector(house);
    buildingHouseDirector.buildBuilding();

    HighRise highrise = new HighRise();
    BuildingDirector buildingHighriseDirector = new BuildingDirector(highrise);
    buildingHighriseDirector.buildBuilding();
  }
}