package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test array/RemoveDuplicates")
public class RemoveDuplicatesTest {
  @ParameterizedTest(name = "Solution 1: Array {0} should have length of {1} after duplication removed")
  @MethodSource("dataSource")
  void testSolution1(int[] arr, int expectedLength) {
    assertEquals(RemoveDuplicates.solution(arr), expectedLength);
  }

  static Stream<Arguments> dataSource() {
    int[] arr1 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int length1 = 5;
    int[] arr2 = { -5, -1, -1, 0, 2, 2, 4, 5, 5 };
    int length2 = 6;
    int[] arr3 = { 3, 3, 3, 3, 0, 0, -2, -2 };
    int length3 = 3;
    int[] arr4 = {};
    int length4 = 0;
    int[] arr5 = { 2, 2, 2, 2, 2, 2, 2, 2 };
    int length5 = 1;
    return Stream.of(Arguments.arguments(arr1, length1), Arguments.arguments(arr2, length2),
        Arguments.arguments(arr3, length3), Arguments.arguments(arr4, length4), Arguments.arguments(arr5, length5));
  }
}
