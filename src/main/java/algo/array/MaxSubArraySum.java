package algo.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

/**
 * @name MaxSubArraySum
 * @description Given an array of integers, find the contiguous subarray which has the largest sum and return its sum
 * The array should contain positive number and negative number.
 * @example arr = [-2,1,-3,4,-1,2,1,-5,4] -> 6 (The subarray is [4, -1, 2, 1], 4 + (-1) + 2 + 1 = 6)
 * @source https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubArraySum {
  /**
   * @param arr
   * @return The largest sum of the subarray
   * @solution The brutal force comparison. Find out all the contiguous subarrays and compare their sums.
   * Time complexity: O(n^2) 
   */
  public static int solution1(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++) {
      int sum = arr[i];
      if(sum > maxSum) {
        maxSum = sum;
      }
      for(int j = i + 1; j < arr.length; j++) {
        sum += arr[j];
        if(sum > maxSum) maxSum = sum;
      }
    }
    return maxSum;
  }
  
  /**
   * @param arr
   * @return The largest sum of the subarray
   * @solution Kadane's algorithm: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
   */
  public static int solution2(int[] arr) {
    int maxSoFar = Integer.MIN_VALUE;
    int maxEndingHere = 0;
    for(int num: arr) {
      maxEndingHere += num;
      if(maxSoFar < maxEndingHere) maxSoFar = maxEndingHere;
      if(maxEndingHere < 0) maxEndingHere = 0;
    }
    return maxSoFar;
  }
  
  /**
   * @param arr
   * @return The largest sum of the subarray
   * @solution Divide and conquer algorithm: https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/
   */
  public static int solution3(int[] arr) {
    return solution3(arr, 0, arr.length - 1);
  }

  public static int solution3(int[] arr, int low, int high) {
    if(low > high) return Integer.MIN_VALUE;
    if(low == high) return arr[low];
    int mid = (low + high) / 2;
    return IntStream.of(
      solution3(arr, low, mid-1),
      solution3(arr, mid+1, high),
      maxCrossingSum(arr, low, mid, high)
    ).max().getAsInt();
  }

  private static int maxCrossingSum(int[] arr, int low, int mid, int high) {
    int sum = 0;
    int leftSum = Integer.MIN_VALUE;
    for(int i = mid; i >= low; i--) {
      sum += arr[i];
      if(sum > leftSum) leftSum = sum;
    }

    sum = 0;
    int rightSum = Integer.MIN_VALUE;
    for(int i = mid; i <= high; i++) {
      sum += arr[i];
      if(sum > rightSum) rightSum = sum;
    }
    return IntStream.of(leftSum + rightSum - arr[mid], leftSum, rightSum).max().getAsInt();
  }
}