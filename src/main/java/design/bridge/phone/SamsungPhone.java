package design.bridge.phone;

public class SamsungPhone implements PhoneFunction {

  @Override
  public void call() {
    System.out.println("Calling with Samsung");
  }

  @Override
  public void text() {
    System.out.println("Texting with Samsung");
  }

  @Override
  public void internet() {
    System.out.println("Using Internet with Samsung");
  }
}