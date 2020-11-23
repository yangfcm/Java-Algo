package algo.sorting;

/** Implement bubble sorting */
// Bubble sorting:
// From i=0 to i<array length
// --From j=0 to (array length - i)
// ----If the element at j is greater than its next element(j+1)
// ------Swap elements j and j+1

public class BubbleSorting {
  public static int[] solution(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < (arr.length - 1 - i); j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }
}
