package design.prototype.case3;

public class App {

  public static void main(String[] args) {
    // 实现3：对于在类中的对象属性，克隆时默认采用值传递
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
    System.out.println(car1.getDealer()); // As for the object property, different instances refer to the same address.
  }
}