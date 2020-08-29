package design.prototype.case4;

public class App {

  public static void main(String[] args) {
    // 实现4：深拷贝
    Dealer dealer = new Dealer("Johns", "1 John st.");
    Car car0 = new Car("Toyota", "Camery", 2019, dealer);
    Car car1 = (Car) car0.clone();
    Car car2 = (Car) car0.clone();
    Car car3 = (Car) car0.clone();
    System.out.println(car0.toString());
    System.out.println(car1.toString());
    System.out.println(car2.toString());
    System.out.println(car3.toString());
    System.out.println(car0.getDealer());
    System.out.println(car1.getDealer());

    Car car4 = (Car) car0.deepClone();
    System.out.println(car4.toString());
    System.out.println(car4.getDealer()); // Its value is different from car0 and car1's value.
  }
}