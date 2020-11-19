package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Array/RotateArray")
public class RotateArrayTest {
  @ParameterizedTest(name = "Rotate array of {0} with {1} steps should be {2}")
  @MethodSource("dataSource")
  void testSolution(Integer[] arr, int k, Integer[] expected) {
    assertArrayEquals(expected, RotateArray.solution(arr, k));
  }

  static Stream<Arguments> dataSource() {
    Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int k1 = 1;
    int k2 = 2;
    int k3 = 3;
    Integer[] expected1 = { 7, 1, 2, 3, 4, 5, 6 };
    Integer[] expected2 = { 6, 7, 1, 2, 3, 4, 5 };
    Integer[] expected3 = { 5, 6, 7, 1, 2, 3, 4 };
    return Stream.of(Arguments.arguments(arr, k1, expected1), Arguments.arguments(arr, k2, expected2),
        Arguments.arguments(arr, k3, expected3));
  }
}
