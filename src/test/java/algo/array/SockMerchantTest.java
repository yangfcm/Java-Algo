package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Array/SockMerchant")
public class SockMerchantTest {
  @ParameterizedTest(name = "Array of {0} should have {1} pairs of socks")
  @MethodSource("dataSource")
  void testSolution(int[] arr, int expectedPairs) {
    assertEquals(expectedPairs, SockMerchant.solution(arr));
  }

  static Stream<Arguments> dataSource() {
    int[] arr1 = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
    int pairs1 = 3;
    int[] arr2 = { 1, 2, 1, 2, 1, 3, 2 };
    int pairs2 = 2;
    int[] arr3 = { 1, 2, 3, 4, 5, 6 };
    int pairs3 = 0;
    return Stream.of(Arguments.arguments(arr1, pairs1), Arguments.arguments(arr2, pairs2),
        Arguments.arguments(arr3, pairs3));
  }

}
