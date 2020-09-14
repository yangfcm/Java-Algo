package design.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值。
 */
public abstract class Expression {
  // 解释公式和数值, key表达式中的字母，如a, b, c等， value是key中的值.如 3, 5, 6分别表示a的值为3,b的值为5,
  // c的值为6等.{ a = 3, b = 5, c = 6 }
  public abstract int interpreter(HashMap<String, Integer> var);
}
