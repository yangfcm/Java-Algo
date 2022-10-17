package algo.sorting;

import java.util.*;

/**
 * @name CountInversions
 * @description In an array, if elements at indices i and j (i < j) while arr[j] > arr[i],
 * we need to swap them to make it in a right order.
 * Given an array, calculate how many swaps/inversions required to sort the array.
 * @example arr = [2, 1, 3, 1, 2], countInversions(arr) -> 4
 * To make array [2, 1, 3, 1, 2] sorted, here is what to do:
 * [2, 1, 3, 1, 2], index: 0, 1, elements: arr[0] = 2, arr[1] = 1 -> 1 swap -> [1, 2, 3, 1, 2]
 * [1, 2, 3, 1, 2], index: 1, 2, elements: arr[1] = 2, arr[2] = 3 -> No swap -> [1, 2, 3, 1, 2]
 * [1, 2, 3, 1, 2], index: 2, 3, elements: arr[2] = 3, arr[3] = 1 -> 2 swaps -> [1, 1, 2, 3, 2]
 * [1, 1, 2, 3, 2], index: 3, 4, elements: arr[3] = 3, arr[4] = 2 -> 1 swap -> [1, 1, 2, 2, 3]
 * So the result is 1 + 2 + 1 = 4 swaps.
 * @source https://www.hackerrank.com/challenges/ctci-merge-sort
 */
public class CountInversions {
  private static int count = 0;
  /**
   * @param arr The array to sort.
   * @return The number of inversions required to sort a given array
   * @solution This is a straightforward solution. Iterate through the array(from index = 1) and for each particular element,
   * look at its previous elements and if there's any one bigger than it, it means one swap required, i.e. adding count by 1.
   * Time complexity: O(n^2)
   */
  public static int solution1(Integer[] arr) {
    count = 0;
    for(int i = 1; i < arr.length; i++) {
      int current = arr[i];
      for(int j = i - 1; j >= 0; j--) {
        if(arr[j] > current) count++;
      }
    }
    return count;
  }

  private static Integer[] mergeSort(Integer[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    Integer centerIndex = arr.length / 2;
    Integer[] leftArr = Arrays.copyOfRange(arr, 0, centerIndex);
    Integer[] rightArr = Arrays.copyOfRange(arr, centerIndex, arr.length);
    return doMerge(mergeSort(leftArr), mergeSort(rightArr));
  }

  private static Integer[] doMerge(Integer[] left, Integer[] right) {
    List<Integer> mergedList = new ArrayList<Integer>();
    List<Integer> leftList = new ArrayList<Integer>(Arrays.asList(left));
    List<Integer> rightList = new ArrayList<Integer>(Arrays.asList(right));
    while (leftList.size() > 0 && rightList.size() > 0) {
      if (leftList.get(0) <= rightList.get(0)) {
        mergedList.add(leftList.get(0));
        leftList.remove(0);
      } else {
        count += leftList.size();
        mergedList.add(rightList.get(0));
        rightList.remove(0);
      }
    }
    mergedList.addAll(leftList);
    mergedList.addAll(rightList);
    return mergedList.toArray(new Integer[mergedList.size()]);
  }

  /**
   * @param arr
   * @return The number of inversions required to sort a given array.
   * @solution Use the idea of merge sort. Time complexity: n*log(n).
   */
  public static int solution2(Integer[] arr) {
    count = 0;
    mergeSort(arr);
    return count;
  }
}