package design.facade.devices;

public class Player {
  private static Player instance = new Player();

  public static Player getInstance() {
    return instance;
  }

  public void turnOn() {
    System.out.println("Player is turned on");
  }

  public void turnOff() {
    System.out.println("Player is turned off");
  }

  public void play() {
    System.out.println("Film is playing");
  }

  public void pause() {
    System.out.println("Film is paused");
  }
}
