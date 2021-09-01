package algo.dynamic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Dynamic/BestSum")
public class BestSumTest {
  
  @ParameterizedTest(name = "solution one: the best sum for {1} to reach target{0} is {2}")
  @MethodSource("bestSumSource")
  void testSolutionOne(int target, int[] numbers, int[] expected) {
    var actual = BestSum.solution1(target, numbers);
    if(actual == null){
      assertNull(actual);
    } else {
      int[] actualArr = actual.stream().mapToInt(i -> i).toArray();
      Arrays.sort(actualArr);
      assertArrayEquals(expected, actualArr);
    }
  }

  @ParameterizedTest(name = "solution one: the best sum for {1} to reach target{0} is {2}")
  @MethodSource({"bestSumSource", "bestSumSourceWithBigNumber"})
  void testSolutionTwo(int target, int[] numbers, int[] expected) {
    var actual = BestSum.solution2(target, numbers);
    if(actual == null){
      assertNull(actual);
    } else {
      int[] actualArr = actual.stream().mapToInt(i -> i).toArray();
      Arrays.sort(actualArr);
      assertArrayEquals(expected, actualArr);
    }
  }

  @ParameterizedTest(name = "solution one: the best sum for {1} to reach target{0} is {2}")
  @MethodSource({"bestSumSource", "bestSumSourceWithBigNumber"})
  void testSolutionThree(int target, int[] numbers, int[] expected) {
    var actual = BestSum.solution3(target, numbers);
    if(actual == null){
      assertNull(actual);
    } else {
      int[] actualArr = actual.stream().mapToInt(i -> i).toArray();
      Arrays.sort(actualArr);
      assertArrayEquals(expected, actualArr);
    }
  }

  static Stream<Arguments> bestSumSource() {
    return Stream.of(
      Arguments.arguments(-1, new int[]{1,2,3}, null),
      Arguments.arguments(0, new int[]{1,2,3}, new int[]{}),
      Arguments.arguments(7, new int[]{2,3}, new int[]{2,2,3}),
      Arguments.arguments(7, new int[]{5,3,4,7}, new int[]{7}),
      Arguments.arguments(8, new int[]{2,3,5}, new int[]{3,5})
    );
  }

  static Stream<Arguments> bestSumSourceWithBigNumber() {
    return Stream.of(
      Arguments.arguments(100, new int[]{2,4,5,10,25,49,51}, new int[]{49,51})
    );
  }
}
