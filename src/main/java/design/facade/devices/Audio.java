package design.facade.devices;

public class Audio {
  private static Audio instance = new Audio();

  public static Audio getInstance() {
    return instance;
  }

  public void turnOn() {
    System.out.println("Audio is turned on");
  }

  public void turnOff() {
    System.out.println("Audio is turned off");
  }

  public void play() {
    System.out.println("Audio is playing");
  }

  public void pause() {
    System.out.println("Audio is paused");
  }

  public void turnUp() {
    System.out.println("Turn up the volume");
  }

  public void turnDown() {
    System.out.println("Turn down the volume");
  }
}
