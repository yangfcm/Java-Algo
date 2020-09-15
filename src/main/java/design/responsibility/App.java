package design.responsibility;

public class App {
  public static void main(String[] args) {
    var request1 = new PurchaseRequest(1, 10001);

    // 创建职责角色
    var deputyDept = new DeputyDeptHandler("Deputy department manager: Andy");
    var dept = new DeputyDeptHandler("Department manager: Bob");
    var deputyManager = new DeputyManagerHandler("Deputy general manager: Carey");
    var manager = new ManagerHandler("General manager: David");

    // 定义职责链，即如果这个金额不在他的职责范围内，下一个处理者应该是谁
    deputyDept.setNextHandler(dept);
    dept.setNextHandler(deputyManager);
    deputyManager.setNextHandler(manager);
    manager.setNextHandler(deputyDept);

    deputyDept.processRequest(request1); // processed by deputy general manager
  }
}
