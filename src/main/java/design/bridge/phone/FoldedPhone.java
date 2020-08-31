package design.bridge.phone;

public class FoldedPhone extends Phone {
  public FoldedPhone(PhoneFunction function) {
    super(function);
  }

  public void call() {
    System.out.println("Folded phone");
    super.call();
  }

  public void text() {
    System.out.println("Folded phone");
    super.call();
  }

  public void internet() {
    System.out.println("Folded phone");
    super.call();
  }
}