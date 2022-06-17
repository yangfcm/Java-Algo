package algo.array;

import java.util.Hashtable;

/**
 * @name TwoSum
 * @description Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * Assume each input would have excactly one solution and you cannot use the same element twice.
 * @example Given nums = [2, 7, 11, 15], target = 9
 * Because nums[0] + nums[1] = 2 + 7 = 9
 * return [0, 1]
 */
public class TwoSum {
  /**
   * @param nums
   * @param target
   * @return An array of two numbers from parameters nums that sum up to target.
   * @throws Exception
   * @solution Loop through each element and see if there is another element that add up to target number.
   * Easy and straightforward. Time complexity: O(n2)
   */
  static public int[] solution1(int[] nums, int target) throws Exception {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    throw new Exception("Wrong arguments");
  }

  /**
   * @param nums
   * @param target
   * @return An array of two numbers from parameters nums that sum up to target.
   * @throws Exception
   * @solution Create an object to record the number(key) and its index(value)
   * And check if each element's complement(target - nums[i]) exists
   */
  static public int[] solution2(int[] nums, int target) throws Exception {
    var map = new Hashtable<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    throw new Exception("Wrong arguments");
  }
}
