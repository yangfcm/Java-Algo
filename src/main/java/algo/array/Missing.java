package algo.array;

import java.util.stream.IntStream;

/**
 * Take an unsorted array of unique numbers from 1 to n. Return the missing
 * number in the sequence or null if there is no missing number There is either
 * no missing number or exactly one missing number.
 */
// e.g.!-- [1, 4, 3, 5] => 2
// [2, 3, 4, 1] => null
// [] => null
public class Missing {
  /**
   * Solution 1: find the max number of the array If max number equals array's
   * length, it means no missing number so return null Otherwise, increment i from
   * 1 to max; if i odesn't exist in the array, it is exactly the missint number.
   */
  public static Integer solution1(int[] arr) {
    if (arr.length == 0) {
      return null;
    }
    int max = arr[0];
    for (int n : arr) {
      if (n > max) {
        max = n;
      }
    }
    if (max == arr.length) {
      return null;
    }
    for (int i = 1; i <= max; i++) {
      int k = i;
      if (!IntStream.of(arr).anyMatch(x -> x == k)) {
        return k;
      }
      // for (int n : arr) {
      // if (n == i) {
      // found = true;
      // }
      // }
      // if (!found) {
      // return i;
      // }
    }
    return null;
  }

  /**
   * Solution 2: The first step is same to solution 1: find the max number. Then
   * calculate the sum of the array. If there is no missing number, its sum should
   * be (max+1) * (max/2) If the sum equals to that, no missing number, otherwise,
   * the difference is just the missing number.
   */
  public static Integer solution2(int[] arr) {
    if (arr.length == 0) {
      return null;
    }
    int max = arr[0];
    int sum = 0;
    // Sum the array while keeping track of the maximum number
    for (int n : arr) {
      sum += n;
      if (n > max) {
        max = n;
      }
    }

    int expectedSum = max * (max + 1) / 2;
    int diff = expectedSum - sum;
    if (diff == 0) {
      return null;
    }
    return diff;
  }
}
