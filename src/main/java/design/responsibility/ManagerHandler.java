package design.responsibility;

public class ManagerHandler extends Handler {
  public ManagerHandler(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    if (request.getPrice() > 50000) {
      System.out.println("Request id " + request.getId() + " is being processed by " + this.name);
    } else {
      nextHandler.processRequest(request);
    }
  }
}
