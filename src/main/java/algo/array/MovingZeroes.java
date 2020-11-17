package algo.array;

import java.util.*;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements. In-place operation
 * e.g. Input: [0,1,0,3,12] Output: [1,3,12,0,0]
 */
public class MovingZeroes {
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
