package algo.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Array/TwoSum")
public class TwoSumTest {
  private int[] arr = { 2, 7, 11, 15, 99 };
  private int target = 110;
  private int[] expectedPairs = { 2, 4 };

  @Test
  void testSolution1() {
    int[] actualPairs;
    try {
      actualPairs = TwoSum.solution1(arr, target);
      assertArrayEquals(expectedPairs, actualPairs);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  void testSolution2() {
    int[] actualPairs;
    try {
      actualPairs = TwoSum.solution2(arr, target);
      assertArrayEquals(expectedPairs, actualPairs);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
