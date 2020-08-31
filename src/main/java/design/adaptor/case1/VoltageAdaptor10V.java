package design.adaptor.case1;

public class VoltageAdaptor10V extends VoltageStandard implements IVoltageAdaptor {

  // 适配器类继承被适配的类并实现
  @Override
  public int output() {
    int srcVoltage = super.output(); // 先获取被适配类的电压。
    int destVoltage = srcVoltage / 22; // 降压（到10V）
    return destVoltage;
  }
}