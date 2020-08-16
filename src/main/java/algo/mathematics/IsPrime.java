package algo.mathematics;

import static java.lang.Math.*;

/**
 * Return true or false, indicating whether a given number is a prime
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