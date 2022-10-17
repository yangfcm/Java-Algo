package algo.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test greedy/GreedyFlorist")
public class GreedyFloristTest {
  
  @ParameterizedTest(name = "The minimum cost is {2} for {1} people to buy flowers in costs of {0}")
  @MethodSource("dataSource")
  void testSolution(Integer[] costs, int k, int expected) {
    assertEquals(expected, GreedyFlorist.solution(costs, k));
  }

  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments(new Integer[] {6, 5, 2}, 3, 13),
      Arguments.arguments(new Integer[] {6, 5, 2}, 2, 15),
      Arguments.arguments(new Integer[] {3, 7, 9, 5, 1}, 3, 29)
    );
  }
}
