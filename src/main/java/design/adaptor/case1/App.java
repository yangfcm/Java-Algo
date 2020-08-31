package design.adaptor.case1;

public class App {
  public static void main(String[] args) {
    Phone phone = new Phone();
    phone.charge(new VoltageAdaptor5V()); // Use the right adaptor
    phone.charge(new VoltageAdaptor10V()); // Use a wrong adaptor
  }
}