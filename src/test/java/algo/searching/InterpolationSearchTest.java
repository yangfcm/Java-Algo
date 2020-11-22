package algo.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterpolationSearchTest {
  private int[] arr = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

  @Test
  @DisplayName("Interpolation search can find the index of value")
  public void testSearchFound() {
    assertEquals(0, InterpolationSearch.solution(arr, 10));
    assertEquals(3, InterpolationSearch.solution(arr, 16));
    assertEquals(9, InterpolationSearch.solution(arr, 23));
    assertEquals(13, InterpolationSearch.solution(arr, 42));
    assertEquals(14, InterpolationSearch.solution(arr, 47));
  }

  @Test
  @DisplayName("Interpolation search return -1 if value not found")
  public void testSearchNotFound() {
    assertEquals(-1, InterpolationSearch.solution(arr, 0));
    assertEquals(-1, InterpolationSearch.solution(arr, 34));
    assertEquals(-1, InterpolationSearch.solution(arr, 99));
  }
}
