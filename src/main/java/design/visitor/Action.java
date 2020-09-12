package design.visitor;

public abstract class Action {
  public abstract void getMaleResult(MalePlayer male);

  public abstract void getFemaleResult(FemalePlayer female);
}
// It's easy to add new actions as long as create a new child action and
// implement the two methods.