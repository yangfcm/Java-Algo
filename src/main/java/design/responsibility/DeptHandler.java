package design.responsibility;

public class DeptHandler extends Handler {
  public DeptHandler(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    if (request.getPrice() > 5000 && request.getPrice() <= 10000) {
      System.out.println("Request id " + request.getId() + " is being processed by " + this.name);
    } else {
      nextHandler.processRequest(request);
    }
  }
}
