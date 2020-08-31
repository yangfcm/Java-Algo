package design.adaptor.case2;

public class VoltageAdaptor10V implements IVoltageAdaptor {
  private VoltageStandard voltageStandard;

  public VoltageAdaptor10V(VoltageStandard voltageStandar) {
    this.voltageStandard = voltageStandar;
  }

  // 适配器类继承被适配的类并实现
  @Override
  public int output() {
    int srcVoltage = voltageStandard.output(); // 先获取被适配类的电压。
    int destVoltage = srcVoltage == 220 ? srcVoltage / 22 : srcVoltage; // 降压（到10V）
    return destVoltage;
  }
}