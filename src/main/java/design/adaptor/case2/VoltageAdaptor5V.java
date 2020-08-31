package design.adaptor.case2;

public class VoltageAdaptor5V implements IVoltageAdaptor {
  // 在case1中 采用继承关系，增加了耦合，而在这里改进为聚合关系。
  private VoltageStandard voltageStandard;

  public VoltageAdaptor5V(VoltageStandard voltageStandar) {
    this.voltageStandard = voltageStandar;
  }

  // 适配器类继承被适配的类并实现
  @Override
  public int output() {
    int srcVoltage = voltageStandard.output(); // 先获取被适配类的电压。
    int destVoltage = srcVoltage == 220 ? srcVoltage / 44 : srcVoltage;
    return destVoltage;
  }
}