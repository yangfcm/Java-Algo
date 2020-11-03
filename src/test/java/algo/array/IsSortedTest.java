package algo.array;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test array/IsSorted")
public class IsSortedTest {
  private static int[][] sortedArrays = { new int[] { 1, 2, 5, 7, 12, 100 }, new int[] { -5, -3, 0, 4, 5, 9 },
      new int[] { 3 }, new int[] { 0, 0, 0, 1, 1, 1, 1, 1 } };

  private static int[][] unsortedArrays = { new int[] { 1, 2, 5, 0, 12, 100 }, new int[] { 9, -2, 0, 8 } };

  @ParameterizedTest(name = "Array {0} should be sorted")
  @MethodSource("SortedArraySource")
  void testIsSortedTrue(int[] arr) {
    assertTrue(IsSorted.solution(arr));
  }

  @ParameterizedTest(name = "Array {0} should be unsorted")
  @MethodSource("UnsortedArraySource")
  void testIsSortedFalse(int[] arr) {
    assertFalse(IsSorted.solution(arr));
  }

  static Stream<Arguments> SortedArraySource() {
    return Stream.of(Arguments.arguments(sortedArrays[0]), Arguments.arguments(sortedArrays[1]),
        Arguments.arguments(sortedArrays[2]), Arguments.arguments(sortedArrays[3]));
  }

  static Stream<Arguments> UnsortedArraySource() {
    return Stream.of(Arguments.arguments(unsortedArrays[0]), Arguments.arguments(unsortedArrays[1]));
  }

}
