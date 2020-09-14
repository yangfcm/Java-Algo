package design.interpreter;

import java.util.HashMap;

/**
 * 抽象运算符解释器，每个运算符都只和自己左右两个数字有关系。 但左右两个数字可能也是一个解释的结果，无论何种种类，都是Expression类的实现类
 */
public class SymbolExpression extends Expression {
  protected Expression left;
  protected Expression right;

  public SymbolExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpreter(HashMap<String, Integer> var) {
    // 这里是个空实现，因为对于Symbol的解释具体是让其子类实现
    // 在这里就是SubExpression(减法操作符)和SumExpression(加法操作符)
    return 0;
  }
}
