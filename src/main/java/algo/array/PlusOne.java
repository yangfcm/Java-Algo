package algo.array;

import java.util.*;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer. e.g. Input: [1,2,3] Output: [1,2,4] Explanation: The
 * array represents the integer 123
 */
public class PlusOne {
  static public Integer[] solution(Integer[] digits) {
    List<Integer> digitsList = new ArrayList<Integer>(Arrays.asList(digits));
    for (int i = digitsList.size() - 1; i >= 0; i--) {
      int digit = digitsList.get(i);
      if (digit < 9) {
        digitsList.set(i, digit + 1);
        break;
      } else if (digit == 9) {
        digitsList.set(i, 0);
        if (i == 0) {
          digitsList.add(0, 1);
        }
      }
    }
    Integer[] returnArr = new Integer[digitsList.size()];
    return digitsList.toArray(returnArr);
  }
}
