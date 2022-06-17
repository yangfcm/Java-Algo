package algo.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @name Intersect
 * @description Given two arrays, compute their intersection.
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * @example nums1 = [4,9,5], nums2 = [9,4,9,8,4], intersect(nums1, nums2) -> [4, 9]
 * nums1 = [1, 1, 1, -2, -2, 5, 8, 9], nums2 = [1, 1, -2, 9, 10], intersect(nums1, nums2) -> [1, 1, -2, 9]
 * nums1 = [2, 3, 4], nums2 = [5, 6, 7], intersect(nums1, nums2) -> []
 */
public class Intersect {
  /**
   * @param nums1
   * @param nums2
   * @return Intersection of nums1 and nums2
   * @solution Iterate one of the array. If the element in the array can be found in the other array,
  * It is exactly the element in intersection and meanwhile remove the element from the other array to avoid futher duplication
   */
  public static List<Integer> solution(int[] nums1, int[] nums2) {
    List<Integer> intersect = new ArrayList<Integer>();
    List<Integer> numList1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
    // convert each element in array int to Integer
    List<Integer> numList2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

    for (int i = 0; i < numList1.size(); i++) {
      // Iterate one of the lists. If the element appears in another list:
      // it means the element is intersected in both arrays. And we should also remove
      // the element from the other list
      if (numList2.size() == 0) {
        break;
      }
      int foundIndex = numList2.indexOf(numList1.get(i));
      if (foundIndex >= 0) {
        intersect.add(numList1.get(i));
        numList2.remove(foundIndex);
      }
    }
    return intersect;
  }
}
