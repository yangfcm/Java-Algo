package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test String/FirstUniqueChar")
public class FirstUniqueCharTest {

  @ParameterizedTest(name = "The first unique character of {0} should be at the index of {1}.")
  @MethodSource("dataSource")
  void testFirstUniqueChar(String str, int expected) {
    assertEquals(FirstUniqueChar.solution(str), expected);
  }

  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments("leetcode", 0),
      Arguments.arguments("loveleetcode", 2),
      Arguments.arguments("aabbccc", -1)
    );
  }
}
