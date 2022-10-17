package algo.greedy;

import java.util.Arrays;

/**
 * @name MinimumAbsoluteDifference
 * @description Given an array of integers, find the minimum absolute difference between any two elements in the array.
 * @example arr = [1 -3 71 68 17] -> 3 (|71-68|= 3)
 * @source https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
 */
public class MinimumAbsoluteDifference {

  /**
   * @param arr An array of integer numbers.
   * @return The minimum absolute difference found.
   * @solution Sort and iterate through the array.
   * Calculate the absolute difference between the number and its next number and find out the minimum one.
   */
  public static int solution(int[] arr) {
    int minDiff = Integer.MAX_VALUE;
    Arrays.sort(arr);
    for(int i = 0; i < arr.length - 1; i++) {
      int diff = Math.abs(arr[i] - arr[i+1]);
      if(diff < minDiff) {
        minDiff = diff;
      }
    }
    return minDiff;
  }
}

