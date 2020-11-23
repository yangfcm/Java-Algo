package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/ReverseString")
public class ReverseStringTest {
  @ParameterizedTest(name = "The reversed string of {0} should be {1}")
  @MethodSource("dataSource")
  void testSolution(String str, String expected) {
    assertEquals(expected, ReverseString.solution(str));
  }

  static Stream<Arguments> dataSource() {
    String str1 = "abcde";
    String reversed1 = "edcba";
    String str2 = "bye";
    String reversed2 = "eyb";
    String str3 = "How do you do";
    String reversed3 = "od uoy od woH";

    return Stream.of(Arguments.arguments(str1, reversed1), Arguments.arguments(str2, reversed2),
        Arguments.arguments(str3, reversed3));
  }

}
