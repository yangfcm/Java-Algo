package algo.array;

import java.util.Hashtable;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. Assume each input would have excactly one
 * solution and you cannot use the same element twice e.g. Given nums = [2, 7,
 * 11, 15], target = 9 Because nums[0] + nums[1] = 2 + 7 = 9 return [0, 1]
 */
public class TwoSum {
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
