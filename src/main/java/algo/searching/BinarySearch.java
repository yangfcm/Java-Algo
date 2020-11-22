package algo.searching;

public class BinarySearch {
  public static int solution(int[] arr, int val) {
    return searchHelper(arr, val, 0, arr.length - 1);
  }

  public static int searchHelper(int[] arr, int val, int start, int end) {
    if (end >= start) {
      int mid = (start + end) / 2;
      if (arr[mid] == val) {
        return mid;
      } else if (val > arr[mid]) {
        return searchHelper(arr, val, mid + 1, end);
      } else if (val < arr[mid]) {
        return searchHelper(arr, val, start, mid - 1);
      }
    }
    return -1;
  }
}
