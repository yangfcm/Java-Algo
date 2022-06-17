package algo.sorting;

import java.util.*;

public class MergeSort {
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
