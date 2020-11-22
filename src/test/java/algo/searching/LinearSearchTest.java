package algo.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test searching/LinearSearch")
public class LinearSearchTest {
  private int[] arr = { 10, 20, 80, 30, 60, 50, 11, 100, 130, 170 };

  @Test
  @DisplayName("Linear search can find the index of value")
  public void testSearchFound() {
    assertEquals(0, LinearSearch.solution(arr, 10));
    assertEquals(arr.length - 1, LinearSearch.solution(arr, 170));
    assertEquals(3, LinearSearch.solution(arr, 30));
  }

  @Test
  @DisplayName("Linear search return -1 if value not found")
  public void testSearchNotFound() {
    assertEquals(-1, LinearSearch.solution(arr, 55));
  }
}
