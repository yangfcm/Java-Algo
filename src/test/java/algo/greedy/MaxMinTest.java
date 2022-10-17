package algo.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test greedy/MaxMin")
public class MaxMinTest {
  
  @ParameterizedTest(name = "The subarry of {1} length from array {0} has minimum difference {2}")
  @MethodSource("dataSource")
  void testSolution(int[] arr, int k, int expected) {
    assertEquals(expected, MaxMin.solution(arr, k));
  }

  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments(new int[] {10, 100, 300, 200, 1000, 20, 30}, 3, 20),
      Arguments.arguments(new int[] {1, 2, 3, 4, 10, 20, 30, 40, 100, 200}, 4, 3),
      Arguments.arguments(new int[] {2, 1, 2, 1, 2, 1}, 2, 0)
    );
  }
}
