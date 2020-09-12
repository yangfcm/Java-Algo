package design.visitor;

public class SuccessAction extends Action {

  @Override
  public void getMaleResult(MalePlayer male) {
    System.out.println("The male player - Success");
  }

  @Override
  public void getFemaleResult(FemalePlayer female) {
    System.out.println("The female player - Success");
  }

}
