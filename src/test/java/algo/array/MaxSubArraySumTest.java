package algo.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Array/MaxSubArraySum")
public class MaxSubArraySumTest {

  @ParameterizedTest(name = "Test MaxSubarraySum Solution1")
  @MethodSource("dataSource")
  void testSolution1(int[] arr, int expected) {
    assertEquals(expected, MaxSubArraySum.solution1(arr));
  }

  @ParameterizedTest(name = "Test MaxSubarraySum Solution2")
  @MethodSource("dataSource")
  void testSolution2(int[] arr, int expected) {
    assertEquals(expected, MaxSubArraySum.solution2(arr));
  }
  
  @ParameterizedTest(name = "Test MaxSubarraySum Solution3")
  @MethodSource("dataSource")
  void testSolution3(int[] arr, int expected) {
    assertEquals(expected, MaxSubArraySum.solution3(arr));
  }
  
  static Stream<Arguments> dataSource() {
    int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int expected1 = 6;
    int[] arr2 = {5, 4, -1, 7, 8};
    int expected2 = 23;
    int[] arr3 = {38, -9, 23, -13, 9, 5, 12, -8, 90, -32, 53, -85, 34, 59, -12, -93};
    int expected3 = 176;
    int[] arr4 = {-9, -3, 5, -10, 3};
    int expected4 = 5;
    return Stream.of(
      Arguments.arguments(arr1, expected1),
      Arguments.arguments(arr2, expected2),
      Arguments.arguments(arr3, expected3),
      Arguments.arguments(arr4, expected4)
    );
  }
}
