package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test array/MovingZeroes")
public class MovingZeroesTest {
  @ParameterizedTest(name = "MovingZeroes can moving zeroes to the end of array")
  @MethodSource("dataSource")
  void testMovingZeroes(Integer[] arr, Integer[] expected) {
    assertArrayEquals(expected, MovingZeroes.solution(arr));
  }

  static Stream<Arguments> dataSource() {
    Integer[] arr1 = { 0, 1, 0, 3, 12 };
    Integer[] expected1 = { 1, 3, 12, 0, 0 };

    Integer[] arr2 = { -5, 0, 0, 3, 0, 0, 0, 0 };
    Integer[] expected2 = { -5, 3, 0, 0, 0, 0, 0, 0 };

    return Stream.of(Arguments.arguments(arr1, expected1), Arguments.arguments(arr2, expected2));
  }
}
