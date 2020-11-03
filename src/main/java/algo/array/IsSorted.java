package algo.array;

/**
 * Return true or false, indicating whether a given array of numbers is sorted
 * by increasing order
 */
public class IsSorted {
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
