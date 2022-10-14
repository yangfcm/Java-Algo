package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/ValidString")
public class ValidStringTest {

  @ParameterizedTest(name = "String {0} is a valid string")
  @MethodSource("validStringData")
  void testStringIsValid(String s) {
    assertTrue(ValidString.solution(s));
  }
  
  @ParameterizedTest(name = "String {0} is an invalid string")
  @MethodSource("invalidStringData")
  void testStringIsInvalid(String s) {
    assertFalse(ValidString.solution(s));
  }

  static Stream<Arguments> validStringData() {
    return Stream.of(
      Arguments.arguments("abcd"),
      Arguments.arguments("abcdefghhgfedecba"),
      Arguments.arguments("aaabbbccccddd")
    );
  }

  static Stream<Arguments> invalidStringData() {
    return Stream.of(
      Arguments.arguments("aabbcd"),
      Arguments.arguments("aabbccddeefghi"),
      Arguments.arguments("aaabbbbcccdddd")
    );
  }
}
