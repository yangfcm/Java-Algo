package algo.greedy;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Greedy/LuckBalance")
public class LuckBalanceTest {
  @ParameterizedTest(name="The max luck balance is {2} for contests {0} and {1}.")
  @MethodSource("dataSource")
  void testSolution(int k, int[][] arr, int expected) {
    assertEquals(expected, LuckBalance.solution(k, arr));
  }


  static Stream<Arguments> dataSource() {
    int[][] arr1 = {
      {5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}
    };
    int k1 = 3;
    int expected1 = 29;

    int[][] arr2 = {
      {13, 1}, {10, 1}, {9, 1}, {8, 1}, {13, 1}, {12, 1}, {18, 1}, {13, 1}
    };
    int k2 = 5;
    int expected2 = 42;

    int[][] arr3 = {
      {5, 1}, {4, 0}, {6, 1}, {2, 1}, {8, 0}
    };
    int k3 = 2;
    int expected3 = 21;

    return Stream.of(
      Arguments.arguments(k1, arr1, expected1),
      Arguments.arguments(k2, arr2, expected2),
      Arguments.arguments(k3, arr3, expected3)
    );
  }
  
}
