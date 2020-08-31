package design.adaptor.case1;

public class VoltageAdaptor5V extends VoltageStandard implements IVoltageAdaptor {

  // 适配器类继承被适配的类并实现
  @Override
  public int output() {
    int srcVoltage = super.output(); // 先获取被适配类的电压。
    int destVoltage = srcVoltage / 44; // 降压（到5V）
    return destVoltage;
  }
}