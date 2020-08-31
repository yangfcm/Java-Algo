package design.bridge;

import design.bridge.phone.*;

public class App {
  public static void main(String[] args) {
    Phone myPhone = new FoldedPhone(new NokiaPhone());
    myPhone.call();
    myPhone.text();
    myPhone.internet();
  }
}