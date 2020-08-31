package design.bridge.phone;

public class UprightPhone extends Phone {
  public UprightPhone(PhoneFunction function) {
    super(function);
  }

  public void call() {
    System.out.println("Upright phone ");
    super.call();
  }

  public void text() {
    System.out.println("Upright phone");
    super.call();
  }

  public void internet() {
    System.out.println("Upright phone");
    super.call();
  }
}