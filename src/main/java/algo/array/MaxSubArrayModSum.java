package algo.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

  /**
   * @param arr
   * @param m
   * @return The maximum sum of the subarray % m.
   * @solution ??
   */
  public static long solution2(long[] arr, int m) {
    long maxSum = 0;
    long minDiff = m;
    long sum = 0;
    List<long[]> sumArr = new ArrayList<long[]>();
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
      sumArr.add(new long[]{ i, sum % m });
      maxSum = Math.max(maxSum, sumArr.get(i)[1] % m);
    }

    Collections.sort(sumArr, (s1, s2) -> s1[1] < s2[1] ? -1 : 1);

    for(int i = 1; i < sumArr.size(); i++) {
      if(
        sumArr.get(i)[1] > sumArr.get(i-1)[1] &&
        sumArr.get(i)[0] < sumArr.get(i-1)[0]
      ) {
        minDiff = Math.min(minDiff, sumArr.get(i)[1] - sumArr.get(i-1)[1]);
      }
    }
    maxSum = Math.max(maxSum, m - minDiff);
    return maxSum;
  }
}
