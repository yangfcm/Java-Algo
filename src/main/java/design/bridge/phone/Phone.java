package design.bridge.phone;

public abstract class Phone {
  private PhoneFunction function;

  public Phone(PhoneFunction function) {
    super();
    this.function = function;
  }

  public void call() {
    this.function.call();
  }

  public void text() {
    this.function.text();
  }

  public void internet() {
    this.function.internet();
  }
}