package design.prototype.case4;

import java.io.*;

public class Car implements Serializable, Cloneable {
  public static final long serialVersionUID = 1L;
  private String make;
  private String model;
  private int year;
  private Dealer dealer;

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

  // Implement deep clone
  public Car deepClone() {
    ByteArrayOutputStream bos = null;
    ObjectOutputStream oos = null;
    ByteArrayInputStream bis = null;
    ObjectInputStream ois = null;
    try {
      bos = new ByteArrayOutputStream();
      oos = new ObjectOutputStream(bos);
      oos.writeObject(this); // 序列化对象

      bis = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bis);
      Car copyObj = (Car) ois.readObject();
      bos.close();
      oos.close();
      bis.close();
      ois.close();
      return copyObj;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
  }
}