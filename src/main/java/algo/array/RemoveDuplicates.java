package algo.array;

/**
 * Given a sorted array nums, remove the duplicates *in-place* such that each
 * element appear only once and return the new length. e.g. Given nums =
 * [0,0,1,1,1,2,2,3,3,4], return length = 5. The array after duplicates moved is
 * [0,1,2,3,4] so length is 5.
 */
public class RemoveDuplicates {
  // This solution just calculates the length, how many distinctive numbers,
  // without really removing numbers from array.
  static public int solution(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int length = 1;
    int current = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {
      if (current != nums[i + 1]) {
        current = nums[i + 1];
        length++;
      }
    }
    return length;
  }
}
