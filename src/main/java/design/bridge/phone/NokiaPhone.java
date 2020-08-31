package design.bridge.phone;

public class NokiaPhone implements PhoneFunction {
  @Override
  public void call() {
    System.out.println("Calling in Nokia");
  }

  @Override
  public void text() {
    System.out.println("Texting in Nokia");
  }

  @Override
  public void internet() {
    System.out.println("Using Internet in Nokia");
  }
}