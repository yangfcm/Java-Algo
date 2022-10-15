package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/SpecialString")
public class SpecialStringTest {
  @ParameterizedTest(name="There are {1} special substrings in string {0}")
  @MethodSource("dataSource") 
  void testSpecialString(String s, int result) {
    assertEquals(result, SpecialString.solution(s));
  }

  
  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments("a", 1),
      Arguments.arguments("aa", 3),
      Arguments.arguments("aaaa", 10),
      Arguments.arguments("abcbaba", 10),
      Arguments.arguments("asasd", 7),
      Arguments.arguments("abcde", 5)
    );
  }
}
