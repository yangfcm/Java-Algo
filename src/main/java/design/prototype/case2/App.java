package design.prototype.case2;

public class App {

  public static void main(String[] args) {
    // 实现2：使用原型克隆
    Car car0 = new Car("Toyota", "Camery", 2019);
    Car car1 = (Car) car0.clone();
    Car car2 = (Car) car0.clone();
    Car car3 = (Car) car0.clone();
    System.out.println(car0.toString());
    System.out.println(car1.toString());
    System.out.println(car2.toString());
    System.out.println(car3.toString());
  }
}