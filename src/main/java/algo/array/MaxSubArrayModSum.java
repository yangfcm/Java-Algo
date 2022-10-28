package algo.array;

/**
 * @name MaxSubArrayModSum
 * @description Given an array of positive numbers and an integer m, find the contiguous subarray where
 * the sum of its elements mod m is the largest.
 * @example arr = [3, 3, 9, 9, 5] m = 7 -> 6 ( 3%7 + 3%7 = 6)
 * @source https://www.hackerrank.com/challenges/maximum-subarray-sum/problem
 */
public class MaxSubArrayModSum {

  /**
   * @param arr
   * @param m
   * @return The maximum (sum of the subarray % m)
   * @solution The brutal force comparison. Find out all the contiguous subarrays and compare their sums.
   * Its time complexity is O(n^2)
   */
  public static long solution1(long[] arr, int m) {
    long maxSum = 0;
    for(int i = 0; i < arr.length; i++) {
      long sum = arr[i] % m;
      if(sum > maxSum) maxSum = sum;
      for(int j = i + 1; j < arr.length; j++) {
        sum = (sum + arr[j]) % m;
        if(sum > maxSum) maxSum = sum;
      }
    }
    return maxSum;
  }
}
