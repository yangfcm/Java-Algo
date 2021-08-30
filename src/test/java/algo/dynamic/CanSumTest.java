package algo.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Dynamic/CanSum")
public class CanSumTest {

  @ParameterizedTest(name = "solution one: should decide if target can be sumed up")
  @MethodSource("canSumSource")
  void testCanSumSolutionOne(int target, int[] numbers, boolean expected) {
    assertEquals(expected, CanSum.solution1(target, numbers)); 
  }

  @ParameterizedTest(name = "solution two: should decide if target can be sumed up")
  @MethodSource({"canSumSource", "canSumSourceWithBigNumber"})
  void testCanSumSolutionTwo(int target, int[] numbers, boolean expected) {
    assertEquals(expected, CanSum.solution2(target, numbers)); 
  }

  @ParameterizedTest(name = "solution three: should decide if target can be sumed up")
  @MethodSource({"canSumSource", "canSumSourceWithBigNumber"})
  void testCanSumSolutionThree(int target, int[] numbers, boolean expected) {
    assertEquals(expected, CanSum.solution1(target, numbers)); 
  }

  static Stream<Arguments> canSumSource() {
    return Stream.of(
      Arguments.arguments(7, new int[]{2, 3}, true),
      Arguments.arguments(7, new int[]{5, 3, 4, 7}, true),
      Arguments.arguments(7, new int[]{2, 4}, false),
      Arguments.arguments(8, new int[]{2, 3, 5}, true)
    );
  }

  static Stream<Arguments> canSumSourceWithBigNumber() {
    return Stream.of(
      Arguments.arguments(300, new int[]{6, 14}, true),
      Arguments.arguments(300, new int[]{7, 14}, false)
    );
  }
}
