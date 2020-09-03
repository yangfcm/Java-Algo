package design.facade.devices;

public class Projector {
  private static Projector instance = new Projector();

  public static Projector getInstance() {
    return instance;
  }

  public void turnOn() {
    System.out.println("Projector is turned on");
  }

  public void turnOff() {
    System.out.println("Projector is turned off");
  }

  public void focus() {
    System.out.println("Project is focused");
  }
}
