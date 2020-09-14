package design.interpreter;

import java.util.HashMap;

/**
 * 变量解释器
 */
public class VarExpression extends Expression {
  private String key; // key 表达式中的变量 a, b, c等

  public VarExpression(String key) {
    this.key = key;
  }

  // var既是用HashMap表示的表达式 { a = 3, b = 5, c = 6 }
  // 功能是根据变量名称，返回对应值。
  @Override
  public int interpreter(HashMap<String, Integer> var) {
    return var.get(this.key);
  }
}
