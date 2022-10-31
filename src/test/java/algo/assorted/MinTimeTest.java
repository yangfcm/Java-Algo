package algo.assorted;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Assorted/MinTime")
public class MinTimeTest {

  @ParameterizedTest(name = "The minimum days required is {2}")
  @MethodSource("dataSource")
  void testSolution(int[] machines, int goal, int expected) {
    assertEquals(expected, MinTime.solution(machines, goal));
  }
  
  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments(new int[] {2, 3}, 5, 6),
      Arguments.arguments(new int[] {1, 3, 4}, 10, 7),
      Arguments.arguments(new int[] {4, 5, 6}, 12, 20)
    );
  }
}
