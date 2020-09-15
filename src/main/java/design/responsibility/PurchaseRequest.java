package design.responsibility;

public class PurchaseRequest {
  private float price = 0.0f; // 购买金额
  private int id = 0; // 请求id

  public PurchaseRequest(int id, float price) {
    this.price = price;
    this.id = id;
  }

  public float getPrice() {
    return price;
  }

  public int getId() {
    return id;
  }
}
