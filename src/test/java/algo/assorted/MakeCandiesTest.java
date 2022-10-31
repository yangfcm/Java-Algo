package algo.assorted;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test assorted/MakeCandies")
public class MakeCandiesTest {
  @ParameterizedTest()
  @MethodSource("dataSource")
  void testSolution(int m, int w, int p, int n, int expected) {
    assertEquals(expected, MakeCandies.solution(m, w, p, n));
  }

  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments(3, 1, 2, 12, 3),
      Arguments.arguments(1, 1, 6, 45, 16),
      Arguments.arguments(1, 2, 343, 270, 135),
      Arguments.arguments(5, 1, 172, 364, 72),
      Arguments.arguments(100, 100, 20, 200, 1)
    );
  }
}
