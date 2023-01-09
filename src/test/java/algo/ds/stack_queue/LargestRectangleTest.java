package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test ds/stack_queue/LargestRectangle")
public class LargestRectangleTest {

  @ParameterizedTest(name = "Test solution one to Largest Rectangle")
  @MethodSource("LargestRectangleTestSource")
  void testLargestRectangleSolution1(int[] heights, int expected) {
    assertEquals(expected, LargestRectangle.solution1(heights));
  }

  @ParameterizedTest(name = "Test solution two to Largest Rectangle")
  @MethodSource("LargestRectangleTestSource")
  void testLargestRectangleSolution2(int[] heights, int expected) {
    assertEquals(expected, LargestRectangle.solution2(heights));
  }
  
  static Stream<Arguments> LargestRectangleTestSource() {
    return Stream.of(
      Arguments.arguments(new int[]{1, 2, 3, 4, 5}, 9),
      Arguments.arguments(new int[]{2, 1, 5, 6, 2, 3}, 10),
      Arguments.arguments(new int[]{11, 11, 10, 10, 10}, 50),
      Arguments.arguments(new int[]{1, 3, 5, 9, 11}, 18)
    );
  }
}
