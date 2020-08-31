package design.adaptor.case2;

public class VoltageStandard {
  public int output() {
    int voltage = 220;
    System.out.println("Output standard voltage " + voltage + 'V');
    return voltage;
  }
}