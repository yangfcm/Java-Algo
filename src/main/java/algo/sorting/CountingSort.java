package algo.sorting;

import java.util.Arrays;

public class CountingSort {
  public static int[] solution(int[] arr) {
    int[] sorted = new int[arr.length];
    int max = arr[0];
    for(int n: arr) {
      if(n > max) {
        max = n;
      }
    }

    int[] count = new int[max+1];
    Arrays.fill(count, 0);

    for(int n: arr) {
      count[n]++;
    }

    for(int i = 1; i < count.length; i++) {
      count[i] += count[i-1];
    }

    for(int n: arr) {
      sorted[count[n] - 1] = n;
      count[n]--;
    }

    return sorted;
  }
}