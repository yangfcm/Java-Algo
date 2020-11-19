package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Array/PlusOne")
public class PlusOneTest {
  @ParameterizedTest(name = "PlasOne can return expected array")
  @MethodSource("dataSource")
  void testPlusOne(Integer[] arr, Integer[] plusArr) {
    assertArrayEquals(PlusOne.solution(arr), plusArr);
  }

  static Stream<Arguments> dataSource() {
    Integer[] arr1 = { 1, 2, 3 };
    Integer[] plus1 = { 1, 2, 4 };
    Integer[] arr2 = { 1, 9, 9, 9 };
    Integer[] plus2 = { 2, 0, 0, 0 };
    Integer[] arr3 = { 9, 9 };
    Integer[] plus3 = { 1, 0, 0 };
    Integer[] arr4 = { 2, 3, 0, 5, 4, 9, 3, 6, 1, 2, 9, 9 };
    Integer[] plus4 = { 2, 3, 0, 5, 4, 9, 3, 6, 1, 3, 0, 0 };
    return Stream.of(Arguments.arguments(arr1, plus1), Arguments.arguments(arr2, plus2),
        Arguments.arguments(arr3, plus3), Arguments.arguments(arr4, plus4));
  }
}
