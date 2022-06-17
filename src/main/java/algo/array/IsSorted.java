package algo.array;

/**
 * @name IsSorted
 * @description Given an array of numbers, return true or false, indicating whether the array is sorted.
 */
public class IsSorted {
  /**
   * @param array
   * @returns True if array is sorted ascendingly, false otherwise.
   * @solution Iterate an array, if the next element is smaller than the current element, return false early.
   * When the iteration finishes, it means the array is sorted so return true.
   */
  public static boolean solution(int[] arr) {
    boolean isSorted = true;
    if (arr.length <= 1) {
      return isSorted;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
      }
    }
    return isSorted;
  }
}
