package algo.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Array/TripleSum")
public class TripleSumTest {
  @ParameterizedTest()
  @MethodSource("dataSource")
  void testSolution(Integer[] a, Integer[] b, Integer[] c, int expected) {
    assertEquals(expected, TripleSum.solution(a, b, c));
  }

  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments(new Integer[]{1, 3, 5}, new Integer[]{2, 3}, new Integer[]{1, 2, 3}, 8),
      Arguments.arguments(new Integer[]{1, 4, 5}, new Integer[]{2, 3, 3}, new Integer[]{1, 2, 3}, 5),
      Arguments.arguments(new Integer[]{1, 5, 7, 3}, new Integer[]{5, 9, 7}, new Integer[]{13, 11 ,9, 7}, 12)
    );
  }
}
