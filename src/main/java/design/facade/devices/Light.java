package design.facade.devices;

public class Light {
  private static Light instance = new Light();

  public static Light getInstance() {
    return instance;
  }

  public void turnOn() {
    System.out.println("Light is turned on");
  }

  public void turnOff() {
    System.out.println("Light is turned off");
  }
}
