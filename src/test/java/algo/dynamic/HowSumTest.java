package algo.dynamic;
 
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Test Dynamic/HowSum")
public class HowSumTest {

  @ParameterizedTest(name = "solution one: should calculate how target is sumed")
  @MethodSource("howSumSource")
  void testHowSumSolutionOne(int target, int[] numbers, int[] expected) {
    var actual = HowSum.solution1(target, numbers); 
    if(actual == null) {
      assertNull(actual);
    } else {
      int[] actualArr = actual.stream().mapToInt(i -> i).toArray();
      Arrays.sort(actualArr);
      assertArrayEquals(expected, actualArr);
    } 
  }

  @ParameterizedTest(name = "solution two: should calculate how target is sumed")
  @MethodSource({"howSumSource", "howSumSourceWithBigNumber"})
  void testHowSumSolutionTwo(int target, int[] numbers, int[] expected) {
    var actual = HowSum.solution2(target, numbers); 
    if(actual == null) {
      assertNull(actual);
    } else {
      int[] actualArr = actual.stream().mapToInt(i -> i).toArray();
      Arrays.sort(actualArr);
      assertArrayEquals(expected, actualArr); 
    }
  }

  @ParameterizedTest(name = "solution three: should calculate how target is sumed")
  @MethodSource({"howSumSource", "howSumSourceWithBigNumber"})
  void testHowSumSolutionThree(int target, int[] numbers, int[] expected) {
    var actual = HowSum.solution3(target, numbers);
    if(actual == null){
      assertNull(actual);
    } else { 
      int[] actualArr = actual.stream().mapToInt(i -> i).toArray();
      Arrays.sort(actualArr);
      assertArrayEquals(expected, actualArr); 
    }
  }

  static Stream<Arguments> howSumSource() {
    return Stream.of(
      Arguments.arguments(7, new int[]{2, 3}, new int[]{2, 2, 3}),
      Arguments.arguments(7, new int[]{5, 3, 4, 7}, new int[]{3, 4}),
      Arguments.arguments(8, new int[]{2, 3, 5}, new int[]{2, 2, 2, 2}),
      Arguments.arguments(7, new int[]{2, 4}, null)
    );
  }

  static Stream<Arguments> howSumSourceWithBigNumber() {
    return Stream.of(
      Arguments.arguments(300, new int[]{286, 14}, new int[]{14, 286}),
      Arguments.arguments(300, new int[]{7, 14}, null)
    );
  }
}
