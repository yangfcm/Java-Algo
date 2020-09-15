package design.responsibility;

public abstract class Handler {
  Handler nextHandler; // 在职责链中的下一个处理人
  String name;

  public Handler(String name) {
    this.name = name;
  }

  public void setNextHandler(Handler handler) {
    this.nextHandler = handler;
  }

  // 处理请求方法，具体实现由子类完成。
  public abstract void processRequest(PurchaseRequest request);
}
