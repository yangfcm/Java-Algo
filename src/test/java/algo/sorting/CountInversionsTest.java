package algo.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test sorting/CountInversions")
public class CountInversionsTest {
  @ParameterizedTest(name = "Solution1 should return correct count of inversions to sort an array.")
  @MethodSource("dataSource")
  void testSolution1(Integer[] arr, int count) {
    assertEquals(CountInversions.solution1(arr), count);
  }

  @ParameterizedTest(name = "Solution2 should return correct count of inversions to sort an array.")
  @MethodSource("dataSource")
  void testSolution2(Integer[] arr, int count) {
    assertEquals(CountInversions.solution2(arr), count);
  }
  
  static Stream<Arguments> dataSource() {
    // Test fixtures
    Integer[] arr1 = { 1, 1, 1, 2, 2, 3, 4, 4, 5 }; 
    int count1 = 0;

    Integer[] arr2 = { 2, 1, 3, 1, 2 }; 
    int count2 = 4;
  
    Integer[] arr3 = { 5, 4, 4, 3, 2, 2, 1, 0 };
    int count3 = 26;

    return Stream.of(
      Arguments.arguments(arr1, count1),
      Arguments.arguments(arr2, count2),
      Arguments.arguments(arr3, count3)
    );
  }
  
}
