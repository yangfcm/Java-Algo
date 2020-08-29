package design.prototype.case4;

import java.io.Serializable;

public class Dealer implements Serializable {
  public static final long serialVersionUID = 1L;
  private String name;
  private String address;

  public Dealer(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}