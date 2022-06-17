package algo.array;

import java.util.*;

/**
 * @name PlusOne
 * @description Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * @example plusOne([1,2,3]) -> [1,2,4]
 * plusOne([1, 9, 9]) -> [2, 0, 0]
 * plusOne([9, 9, 9]) -> [1, 0, 0, 0]
 */
public class PlusOne {
  /**
   * @param digits
   * @return An array that represents digits array plus by one.
   * @solution Need to especially pay attention to the case when the 'integer' ends with 9.
   */
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
