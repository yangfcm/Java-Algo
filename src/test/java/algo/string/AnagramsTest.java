package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test String/Anagrams")
public class AnagramsTest {

  @ParameterizedTest(name = "Solution one: string \"{0}\" and string \"{1}\" are anagrams")
  @MethodSource("anagramsSource")
  void testAnagramsSolutionOne(String str1, String str2) {
    assertTrue(Anagrams.runSolutionOne(str1, str2));
  }

  @ParameterizedTest(name = "Solution two: string \"{0}\" and string \"{1}\" are anagrams")
  @MethodSource("anagramsSource")
  void testAnagramsSolutionTwo(String str1, String str2) {
    assertTrue(Anagrams.runSolutionTwo(str1, str2));
  }

  @ParameterizedTest(name = "Solution one: string \"{0}\" and string \"{1}\" are NOT anagrams")
  @MethodSource("nonAnagramsSource")
  void testNonAnagramsSolutionOne(String str1, String str2) {
    assertFalse(Anagrams.runSolutionOne(str1, str2));
  }

  @ParameterizedTest(name = "Solution two: string \"{0}\" and string \"{1}\" are NOT anagrams")
  @MethodSource("nonAnagramsSource")
  void testNonAnagramsSolutionTwo(String str1, String str2) {
    assertFalse(Anagrams.runSolutionTwo(str1, str2));
  }

  static Stream<Arguments> anagramsSource() {
    return Stream.of(Arguments.arguments("hello", "llohe"), Arguments.arguments("Whoa? Hi!", "*Hi* Whoa."));
  }

  static Stream<Arguments> nonAnagramsSource() {
    return Stream.of(Arguments.arguments("one", "two"), Arguments.arguments("aaabbcc", "ccbaaa"));
  }
}