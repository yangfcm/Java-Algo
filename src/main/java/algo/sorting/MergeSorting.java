package algo.sorting;

import java.util.*;

/**
 * Implement merge sorting : The purpose of merge function is to take two sorted
 * arrays(left, right) into one sorted array
 */
// Create an empty array to hold the sorted array called 'merged'
// While there are still elements in both arrays
// --If the first element of the left half is less than first in the right
// half
// ----'Shift' the element from the left into the 'merged' array
// --else
// ----'Shift' the element from the right into the 'merged' array
// Take everything from the array that still has element(s) in it and put it
// in 'merged'
public class MergeSorting {
  public static Integer[] solution(Integer[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    Integer centerIndex = arr.length / 2;
    Integer[] leftArr = Arrays.copyOfRange(arr, 0, centerIndex);
    Integer[] rightArr = Arrays.copyOfRange(arr, centerIndex, arr.length);
    return doMerge(solution(leftArr), solution(rightArr));
  }

  private static Integer[] doMerge(Integer[] left, Integer[] right) {
    List<Integer> mergedList = new ArrayList<Integer>();
    List<Integer> leftList = new ArrayList<Integer>(Arrays.asList(left));
    List<Integer> rightList = new ArrayList<Integer>(Arrays.asList(right));
    while (leftList.size() > 0 && rightList.size() > 0) {
      if (leftList.get(0) < rightList.get(0)) {
        mergedList.add(leftList.get(0));
        leftList.remove(0);
      } else {
        mergedList.add(rightList.get(0));
        rightList.remove(0);
      }
    }
    mergedList.addAll(leftList);
    mergedList.addAll(rightList);
    return mergedList.toArray(new Integer[mergedList.size()]);
  }
}
