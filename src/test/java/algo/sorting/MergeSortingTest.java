package algo.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test sorting/MergeSorting")
public class MergeSortingTest {
  private Integer[] arr = { 100, -40, 500, -124, 0, 21, 7 };
  private Integer[] sorted = { -124, -40, 0, 7, 21, 100, 500 };

  @Test
  @DisplayName("Merge sorting should sort the array")
  public void testMergeSorting() {
    assertArrayEquals(sorted, MergeSorting.solution(arr));
  }
}
