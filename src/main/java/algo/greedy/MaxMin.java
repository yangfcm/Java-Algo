package algo.greedy;

import java.util.Arrays;

/**
 * @name MaxMin
 * @description Given an array of integers and a single integer k, create an array of length k from
 * elements of arr such that its difference between the biggest element and smallest element is minimized.
 * @example arr = [10, 100, 300, 200, 1000, 20, 30], k = 3 -> 20
 * Choose k = 3 elements from arr: [10, 20, 30] where the maximum is 30 and the minimum is 10 and their difference is 20.
 * @source https://www.hackerrank.com/challenges/angry-children
 */
public class MaxMin {

  /**
   * @param arr
   * @param k
   * @return The sub array of of length k from elements of arr that has the minimum difference.
   * @solution Take the above as example: First sort the array like [10, 20, 30, 100, 200, 300, 1000]
   * Imagine there is a "window" of length of k moving along the array,
   * test the difference between the first element and last element in the window and find out the minimum one.
   * [10, 20, 30,] 100, 200, 300, 1000 -> 20
   * 10, [20, 30, 100,] 200, 300, 1000 -> 80
   * 10, 20, [30, 100, 200,] 300, 1000 -> 170
   * 10, 20, 30, [100, 200, 300,] 1000 -> 200
   * 10, 20, 30, 100, [200, 300, 1000] -> 800
   * So the minimum is 20.
   */
  public static int solution(int[] arr, int k) {
    Arrays.sort(arr);
    int minDiff = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length - k; i++) {
      int diff = arr[i+k-1] - arr[i];
      if(diff < minDiff) {
        minDiff = diff;
      }
    }
    return minDiff;
  }
}
