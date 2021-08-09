package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test String/MakeAnagrams")
public class MakeAnagramsTest {
  @ParameterizedTest(name = "Test solution: delete {2} characters to make string \"{0}\" and string \"{1}\" anagrams")
  @MethodSource("makeAnagramsSource")
  void testMakeAnagramsSolution(String str1, String str2, int expected) {
    int actual = MakeAnagrams.Solution(str1, str2);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> makeAnagramsSource() {
    return Stream.of(Arguments.arguments("cde", "abc", 4), Arguments.arguments("showman", "woman", 2),
        Arguments.arguments("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke", 30));
  }
}
