package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/OneAway")
public class OneAwayTest {
  @ParameterizedTest(name = "String {0} and String {1} is one away")
  @MethodSource("oneAwayData")
  void testIsBalanced(String str1, String str2) {
    assertTrue(OneAway.solution(str1, str2));
  }

  @ParameterizedTest(name = "String {0} and String {1} is NOT one away")
  @MethodSource("notOneAwayData")
  void testIsNotBalanced(String str1, String str2) {
    assertFalse(OneAway.solution(str1, str2));
  }

  static Stream<Arguments> oneAwayData() {
    return Stream.of(Arguments.arguments("pale", "pales"), Arguments.arguments("pale", "pal"),
        Arguments.arguments("pale", "bale"), Arguments.arguments("pale", "pals"), Arguments.arguments("pale", "pales"));
  }

  static Stream<Arguments> notOneAwayData() {
    return Stream.of(Arguments.arguments("pale", "bake"), Arguments.arguments("johnson", "john"),
        Arguments.arguments("pale", "pad"));

  }
}
