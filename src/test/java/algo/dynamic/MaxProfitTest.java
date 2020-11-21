package algo.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Dynamic/MaxProfit")
public class MaxProfitTest {
  @Test
  @DisplayName("should calculate correct max profit")
  public void testSolution() {
    assertEquals(MaxProfit.solution(new int[] { 7, 1, 5, 3, 4, 6, 4 }), 7);
    assertEquals(MaxProfit.solution(new int[] { 1, 2, 3, 4, 5 }), 4);
    assertEquals(MaxProfit.solution(new int[] { 5, 4, 3, 2, 1 }), 0);
    assertEquals(MaxProfit.solution(new int[] { 5, 4, 3, 2, 1, 2, 3, 4, 5 }), 4);
    assertEquals(MaxProfit.solution(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1 }), 4);
  }
}
