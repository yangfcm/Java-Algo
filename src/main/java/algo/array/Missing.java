package algo.array;

import java.util.stream.IntStream;

/**
 * @name Missing
 * @description Take an unsorted array of unique numbers from 1 to n.
 * Return the missing number in the sequence or undefined if there is no missing number
 * There are either no missing numbers or exactly one missing number.
 * Do it in O(N) time.
 * @example arr = [1, 4, 3, 5], missing(arr) -> 2
 * arr = [2, 3, 4, 1], missing(arr) -> undefined
 * arr = [], missing(arr) -> undefined
 */
public class Missing {
  /**
   * @param arr
   * @return A missing number or null.
   * @solution Solution1: Sum the array and keep track of the maximum number in it.
   * Now, with the maximum number, we can calculate what we should expect the sum to be.
   * If the expected sum equals to the sum of the array, it means there's no missing number.
   * Otherwise, the missing number is exactly the difference between expected sum and the sum of array.
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
    }
    return null;
  }

  /**
   * @param arr
   * @return A missing number or null.
   * @solution Solution2: The first step is same to solution 1: find the max number. Then
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
