package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/StringCompression")
public class StringCompressionTest {

  @ParameterizedTest(name = "Compression of string {0} should be {1}")
  @MethodSource("dataSource")
  void testSolution(String str, String expected) {
    assertEquals(expected, StringCompression.solution(str));
  }

  static Stream<Arguments> dataSource() {
    String str1 = "aaaaaaaaaaaa";
    String expected1 = "a12";
    String str2 = "xxxxxxyyyxxzzzyz";
    String expected2 = "x6y3x2z3y1z1";
    String str3 = "aabcccccaaa";
    String expected3 = "a2b1c5a3";
    String str4 = "hello";
    String expected4 = "hello";
    return Stream.of(Arguments.arguments(str1, expected1), Arguments.arguments(str2, expected2),
        Arguments.arguments(str3, expected3), Arguments.arguments(str4, expected4));
  }

}
