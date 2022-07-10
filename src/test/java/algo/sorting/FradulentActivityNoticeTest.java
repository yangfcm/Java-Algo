package algo.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test sorting/FradulentActivityNotice")
public class FradulentActivityNoticeTest {
  @ParameterizedTest(name = "Solution should return correct count of notice.")
  @MethodSource("dataSource")
  void testSolution(int[] exp, int d, int count) {
    assertEquals(FradulentActivityNotice.solution(exp, d), count);
  }
  
  static Stream<Arguments> dataSource() {
    // Test fixtures
    int[] exp1 = { 2, 3, 4, 2, 3, 6, 8, 4, 5 };
    int d1 = 5;
    int count1 = 2;

    int[] exp2 = { 1, 2, 3, 4, 4 };
    int d2 = 4;
    int count2 = 0;
  
    int[] exp3 = { 10, 20, 30, 40, 50 };
    int d3 = 3;
    int count3 = 1;

    return Stream.of(
      Arguments.arguments(exp1, d1, count1),
      Arguments.arguments(exp2, d2, count2),
      Arguments.arguments(exp3, d3, count3)
    );
  }
  
}
