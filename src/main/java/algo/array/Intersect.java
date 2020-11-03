package algo.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given two arrays, write a function to compute their intersection. Each
 * element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order. e.g. Input: nums1 = [4,9,5], nums2 =
 * [9,4,9,8,4] Output: [4,9]
 */
public class Intersect {
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
