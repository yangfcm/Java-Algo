package algo.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test sorting/SelectionSorting")
public class SelectionSortTest {

  private int[] arr = { 100, -40, 500, -124, 0, 21, 7 };
  private int[] sorted = { -124, -40, 0, 7, 21, 100, 500 };

  @Test
  @DisplayName("Selection sorting should sort the array")
  public void testSelectionSorting() {
    SelectionSor.solution(arr);
    assertArrayEquals(sorted, arr);
  }
}
