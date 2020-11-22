package algo.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JumpSearchTest {
  private int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };

  @Test
  @DisplayName("Jump search can find the index of value")
  public void testSearchFound() {
    assertEquals(0, JumpSearch.solution(arr, 0));
    assertEquals(1, JumpSearch.solution(arr, 1));
    assertEquals(10, JumpSearch.solution(arr, 55));
    assertEquals(15, JumpSearch.solution(arr, 610));
  }

  @Test
  @DisplayName("Jump search return -1 if value not found")
  public void testSearchNotFound() {
    assertEquals(-1, JumpSearch.solution(arr, 9));
    assertEquals(-1, JumpSearch.solution(arr, -5));
    assertEquals(-1, JumpSearch.solution(arr, 1000));
  }
}
