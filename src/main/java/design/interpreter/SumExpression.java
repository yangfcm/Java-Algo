package design.interpreter;

import java.util.HashMap;

public class SumExpression extends SymbolExpression {
  public SumExpression(Expression left, Expression right) {
    super(left, right);
  }

  public int interpreter(HashMap<String, Integer> var) {
    return super.left.interpreter(var) + super.right.interpreter(var);
  }
}
