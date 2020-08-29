package design.prototype.case3;

public class Car implements Cloneable {
  private String make;
  private String model;
  private int year;
  private Dealer dealer; // Add an object property.

  public Car(String make, String model, int year, Dealer dealer) {
    super();
    this.make = make;
    this.model = model;
    this.year = year;
    this.dealer = dealer;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Dealer getDealer() {
    return dealer;
  }

  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  @Override
  public String toString() {
    return "Car [make=" + make + ", model=" + model + ", year=" + year + "] Its dealer's name is " + dealer.getName()
        + " at " + dealer.getAddress();
  }

  // 克隆实例
  @Override
  public Object clone() { // clone method is shallow clone, which means as for the object
                          // property(dealer), it will create only one copy in memory and each instance
                          // will refer to the copy.
    Car car = null;
    try {
      car = (Car) super.clone();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return car;
  }
}