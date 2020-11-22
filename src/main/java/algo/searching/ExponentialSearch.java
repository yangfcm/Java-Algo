package algo.searching;

public class ExponentialSearch {
  public static int solution(int[] arr, int val) {
    if (arr[0] == val) {
      return 0;
    }
    int i = 1;
    while (i < arr.length && arr[i] <= val) {
      i = i * 2;
    }
    return BinarySearch.searchHelper(arr, val, i / 2, Math.min(i, arr.length - 1));
  }
}
