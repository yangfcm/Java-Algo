package algo.mathematics;

import static java.lang.Math.*;

/**
 * @name IsPrime
 * @description Check if a given number is a prime number or not.
 */
public class IsPrime {
  public static boolean run(int num) {
    if (num < 2) {
      return false;
    }
    int maxDivisor = (int) ceil(sqrt(num));
    for (int divisor = 2; divisor <= maxDivisor; divisor++) {
      if (num % divisor == 0 && num != divisor) {
        return false;
      }
    }
    return true;
  }
}