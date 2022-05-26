package algo.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test sorting/CountingSort")
public class CountingSortTest {
  private int[] arr = {4, 20, 1, 1, 12, 6, 24, 12, 8, 9};
  private int[] sorted = {1, 1, 4, 6, 8, 9, 12, 12, 20, 24};
  
  @Test
  @DisplayName("Counting sort should sort the array")
  public void testCountingSort() {
    assertArrayEquals(sorted, CountingSort.solution(arr));
  }
}
