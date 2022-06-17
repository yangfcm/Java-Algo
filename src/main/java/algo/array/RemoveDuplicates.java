package algo.array;

/**
 * @name RemoveDuplicates
 * @description Given a sorted array of numbers, remove the duplicates *in-place* such that each element appear only once and return the new length.
 * @example removeDuplicates([0,0,1,1,1,2,2,3,3,4]) -> [0, 1, 2, 3, 4] and length = 5.
 */
public class RemoveDuplicates {
  /**
   * @param nums
   * @return The length of the array after duplicated numbers are removed.
   * @todo Should remove the duplications in place
   */
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
