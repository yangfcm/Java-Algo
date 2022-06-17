package algo.array;

import java.util.*;
/**
* @name RotateArray
* @description Given an array, rotate the array to the right by k steps, where k is non-negative.
* @example  [1, 2, 3, 4, 5, 6, 7], k = 3 -> [5, 6, 7, 1, 2, 3, 4]
* The 1st rotate: [7, 1, 2, 3, 4, 5, 6](The last number 7 is moved to the top of the array)
* The 2nd rotate: [6, 7, 1, 2, 3, 4, 5](Then, the last number 6 is moved to the top of the array)
* The 3rd rotate: [5, 6, 7, 1, 2, 3, 4].
*/
public class RotateArray {
  /**
   * @param nums
   * @param k
   * @return The roated array
   */
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
