package design.responsibility;

/** 副部门经理级别的审批人 */
public class DeputyDeptHandler extends Handler {
  public DeputyDeptHandler(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    if (request.getPrice() <= 5000) {
      System.out.println("Request id " + request.getId() + " is being processed by " + this.name);
    } else {
      nextHandler.processRequest(request);
    }
  }
}
