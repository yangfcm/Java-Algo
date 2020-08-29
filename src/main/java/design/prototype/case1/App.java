package design.prototype.case1;

public class App {

  public static void main(String[] args) {
    // 实现1：直接使用constructor创建和car0属性一样的三个car实例。
    // 简单直接，但是每次创建新对象时，都需要获取原始对象的属性，当属性较多时，这样写效率太低。
    // 不易扩展，不够灵活。
    Car car0 = new Car("Toyota", "Camery", 2019);
    Car car1 = new Car(car0.getMake(), car0.getModel(), car0.getYear());
    Car car2 = new Car(car0.getMake(), car0.getModel(), car0.getYear());
    Car car3 = new Car(car0.getMake(), car0.getModel(), car0.getYear());
    System.out.println(car0.toString());
    System.out.println(car1.toString());
    System.out.println(car2.toString());
    System.out.println(car3.toString());
  }
}