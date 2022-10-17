package algo.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test greedy/MinimumAbsoluteDifference")
public class MinimumAbsoluteDifferenceTest {

  @ParameterizedTest(name = "Should find out correct minimum absolute difference in a given array")
  @MethodSource("dataSource")
  void testSolution(int[] arr, int expected) {
    assertEquals(expected, MinimumAbsoluteDifference.solution(arr));
  }
  
  static Stream<Arguments> dataSource() {
    int[] arr1 = {3, -7, 0};
    int min1 = 3;
    int[] arr2 = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
    int min2 = 1;
    int[] arr3 = {1, -3, 71, 68, 17};
    int min3 = 3;

    return Stream.of(
      Arguments.arguments(arr1, min1),
      Arguments.arguments(arr2, min2),
      Arguments.arguments(arr3, min3)
    );
  }
}
