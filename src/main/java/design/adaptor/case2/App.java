package design.adaptor.case2;

public class App {
  public static void main(String[] args) {
    Phone phone = new Phone();
    VoltageStandard voltageStandard = new VoltageStandard();
    phone.charge(new VoltageAdaptor5V(voltageStandard)); // Use the right adaptor
    phone.charge(new VoltageAdaptor10V(voltageStandard)); // Use a wrong adaptor
  }
}