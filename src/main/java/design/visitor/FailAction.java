package design.visitor;

public class FailAction extends Action {
  @Override
  public void getMaleResult(MalePlayer male) {
    System.out.println("The male player - Fail");
  }

  @Override
  public void getFemaleResult(FemalePlayer female) {
    System.out.println("The female player - Fail");
  }
}
