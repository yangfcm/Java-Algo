package algo.searching;

public class JumpSearch {
  public static int solution(int[] arr, int val) {
    int len = arr.length;
    int lastIndex = len - 1;
    int step = (int) Math.sqrt((float) len);
    int startIndex = 0;
    int endIndex = startIndex + step - 1;
    while (arr[Math.min(endIndex, lastIndex)] < val) {
      startIndex += step;
      endIndex += step;
      if (startIndex > lastIndex) {
        return -1;
      }
    }
    for (int i = startIndex; i <= Math.min(endIndex, lastIndex); i++) {
      if (arr[i] == val) {
        return i;
      }
    }
    return -1;

  }
}
