package design.facade.devices;

public class Screen {
  private static Screen instance = new Screen();

  public static Screen getInstance() {
    return instance;
  }

  public void ready() {
    System.out.println("Screen is available");
  }

  public void close() {
    System.out.println("Screen is closed");
  }

}
