package algo.searching;

public class InterpolationSearch {
  public static int solution(int[] arr, int val) {
    return searchHelper(arr, val, 0, arr.length - 1);
  }

  public static int searchHelper(int[] arr, int val, int low, int high) {
    if (low < high && val >= arr[low] && val <= arr[high]) {
      int pos = low + (val - arr[low]) * (high - low) / (arr[high] - arr[low]);
      if (arr[pos] == val) {
        return pos;
      } else if (arr[pos] < val) {
        return searchHelper(arr, val, pos + 1, high);
      } else if (arr[pos] > val) {
        return searchHelper(arr, val, low, pos - 1);
      }
    }
    return -1;
  }
}
