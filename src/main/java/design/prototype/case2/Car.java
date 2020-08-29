package design.prototype.case2;

public class Car implements Cloneable {
  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    super();
    this.make = make;
    this.model = model;
    this.year = year;
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

  @Override
  public String toString() {
    return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
  }

  // 克隆实例
  @Override
  public Object clone() {
    Car car = null;
    try {
      car = (Car) super.clone();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return car;
  }
}