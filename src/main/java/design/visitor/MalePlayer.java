package design.visitor;

public class MalePlayer extends Player {
  @Override
  public void accept(Action action) {
    // 这里使用到了双分派：首先将具体状态(action)作为参数传递到该类中
    // 然后在类中调用作为参数的具体方法(getMaleResult)，同时将自己(this)作为参数传入，完成第二次分派。
    action.getMaleResult(this);
  }
}
