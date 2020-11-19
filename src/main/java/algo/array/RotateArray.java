package algo.array;

import java.util.*;

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative. Modify array in-place e.g. Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 */
public class RotateArray {
  static public Integer[] solution(Integer[] nums, int k) {
    int length = nums.length;
    List<Integer> numsList = new ArrayList<Integer>(Arrays.asList(nums));
    for (int i = 1; i <= k; i++) {
      int lastNumber = numsList.get(length - 1);
      numsList.remove(length - 1);
      numsList.add(0, lastNumber);
    }
    return numsList.toArray(new Integer[numsList.size()]);
  }
}
