package design.adaptor.case1;

public class Phone {
  private final int chargeVoltage = 5;

  public void charge(IVoltageAdaptor voltageAdaptor) {
    if (voltageAdaptor.output() == chargeVoltage) {
      System.out.println("Voltage matched, charging...");
    } else {
      System.out.println("Warning: Voltage not matched!");
    }
  }
}