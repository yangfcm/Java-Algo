package design.builder.case1;

/**
 * 实现1： 定义一个建筑物抽象类，不同类型的建筑物继承它，并实现内部各方法。（不使用设计模式）
 * 这样的实现结构简单，把产品和创建过程封装在一起，增强了耦合性，但不利于扩展和维护。
 */
public class App {
  public static void main(String[] args) {
    House house = new House();
    HighRise highRise = new HighRise();
    house.doBuild();
    highRise.doBuild();
  }
}