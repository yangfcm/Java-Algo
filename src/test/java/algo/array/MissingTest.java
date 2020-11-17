package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Array/Missing")
public class MissingTest {
  @ParameterizedTest(name = "Solution 1 can return expected result")
  @MethodSource("dataSource")
  void testSolution1(int[] arr, Integer missing) {
    assertEquals(Missing.solution1(arr), missing);
  }

  @ParameterizedTest(name = "Solution 2 can return expected result")
  @MethodSource("dataSource")
  void testSolution2(int[] arr, Integer missing) {
    assertEquals(Missing.solution2(arr), missing);
  }

  static Stream<Arguments> dataSource() {
    int[] arr1 = { 1, 4, 3, 5, 6 };
    Integer missing1 = 2;
    int[] arr2 = { 2, 5, 4, 3, 1 };
    Integer missing2 = null;
    int[] arr3 = {};
    Integer missing3 = null;

    return Stream.of(Arguments.arguments(arr1, missing1), Arguments.arguments(arr2, missing2),
        Arguments.arguments(arr3, missing3));
  }
}
