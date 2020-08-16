package algo.mathematics;

import java.util.*;

public class Fibonacci {
  public static long solutionOne(int n) {
    if (n < 2)
      return n;
    return solutionOne(n - 1) + solutionOne(n - 2);
  }

  public static long solutionTwo(int n) {
    List<Long> fibList = new ArrayList<Long>();
    fibList.add(Long.valueOf(0));
    fibList.add(Long.valueOf(1));
    for (int i = 2; i <= n; i++) {
      long a = fibList.get(i - 1); // The previous number
      long b = fibList.get(i - 2); // The previous and previous number
      fibList.add(Long.valueOf(a + b));
    }
    return fibList.get(n);
  }

  public static long solutionThree(int n, Long ac1, Long ac2) {
    ac1 = ac1 == null ? 1 : ac1;
    ac2 = ac2 == null ? 1 : ac2;
    if (n <= 2)
      return ac2;
    return solutionThree(n - 1, ac2, ac1 + ac2);
  }

}