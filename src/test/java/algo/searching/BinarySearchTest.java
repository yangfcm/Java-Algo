package algo.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test searching/BinarySearchTest")
public class BinarySearchTest {
  private int[] arr = { -5, -1, 0, 2, 12, 23, 38, 72, 91, 1001 };

  @Test
  @DisplayName("Binary search can find the index of value")
  public void testSearchFound() {
    assertEquals(0, BinarySearch.solution(arr, -5));
    assertEquals(arr.length - 1, BinarySearch.solution(arr, 1001));
    assertEquals(4, BinarySearch.solution(arr, 12));
    assertEquals(7, BinarySearch.solution(arr, 72));
  }

  @Test
  @DisplayName("Binary search return -1 if value not found")
  public void testSearchNotFound() {
    assertEquals(-1, BinarySearch.solution(arr, 100));
  }
}
