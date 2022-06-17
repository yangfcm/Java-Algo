package algo.sorting;

public class SelectionSor {
  public static void solution(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int indexOfMin = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[indexOfMin]) {
          indexOfMin = j;
        }
      }
      if (indexOfMin != i) {
        int temp = arr[i];
        arr[i] = arr[indexOfMin];
        arr[indexOfMin] = temp;
      }
    }
  }
}
