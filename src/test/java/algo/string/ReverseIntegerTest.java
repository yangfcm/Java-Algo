package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/ReverseInteger")
public class ReverseIntegerTest {

  @ParameterizedTest(name = "The reversed number of {0} should be {1}")
  @MethodSource("dataSource")
  void testSolution(int number, int expected) {
    assertEquals(expected, ReverseInteger.solution(number));
  }

  static Stream<Arguments> dataSource() {
    int num1 = 521;
    int reversed1 = 125;
    int num2 = -521;
    int reversed2 = -125;
    int num3 = 1200;
    int reversed3 = 21;

    return Stream.of(Arguments.arguments(num1, reversed1), Arguments.arguments(num2, reversed2),
        Arguments.arguments(num3, reversed3));
  }
}
