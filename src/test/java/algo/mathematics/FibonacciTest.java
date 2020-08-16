package algo.mathematics;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math/Fibonacci")
public class FibonacciTest {

  @ParameterizedTest(name = "Solution One: Fibnacci({0}) equals to {1}")
  @MethodSource("testFibonacciSource")
  void testFibonacciSolutionOne(int num, long fibNum) {
    assertEquals(Fibonacci.solutionOne(num), fibNum);
  }

  @ParameterizedTest(name = "Solution Two: Fibnacci({0}) equals to {1}")
  @MethodSource("testFibonacciSource")
  void testFibonacciSolutionTwo(int num, long fibNum) {
    assertEquals(Fibonacci.solutionOne(num), fibNum);
  }

  @ParameterizedTest(name = "Solution Three: Fibnacci({0}) equals to {1}")
  @MethodSource("testFibonacciSource")
  void testFibonacciSolutionThree(int num, long fibNum) {
    assertEquals(Fibonacci.solutionOne(num), fibNum);
  }

  static Stream<Arguments> testFibonacciSource() {
    return Stream.of(Arguments.arguments(1, 1), Arguments.arguments(2, 1), Arguments.arguments(3, 2),
        Arguments.arguments(4, 3), Arguments.arguments(39, 63245986));
  }
}