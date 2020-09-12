package design.visitor;

public class FemalePlayer extends Player {
  @Override
  public void accept(Action action) {
    action.getFemaleResult(this);
  }
}
