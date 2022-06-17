package algo.array;

import java.util.*;

/**
 * @name MovingZeroes
 * @description Given an array of numbers, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * @example nums = [0,1,0,3,12], moveZeroes(nums) -> [1,3,12,0,0]
 */
public class MovingZeroes {
  /**
   * @param arr
   * @return An array where all 0's in arr is in the end.
   * @solution The solution is straightforward, iterate the array and if the element is 0, move it to the end of array.
   */
  public static Integer[] solution(Integer[] arr) {
    List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
    boolean trailingZero = true;
    for (int i = arrList.size() - 1; i >= 0; i--) {
      if (arrList.get(i) != 0) {
        trailingZero = false;
      }
      if (arrList.get(i) == 0 && !trailingZero) {
        arrList.add(0);
        arrList.remove(i);
      }
    }

    Integer[] newArr = new Integer[arrList.size()];
    // newArr = arrList.toArray(newArr);
    return arrList.toArray(newArr);
  }
}
