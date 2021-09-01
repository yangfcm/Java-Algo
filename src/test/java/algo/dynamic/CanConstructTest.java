package algo.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Dynamic/CanConstruct")
public class CanConstructTest {
  
  @ParameterizedTest(name = "solution one: if {0} can be constructed with the strings from {1}: {2}")
  @MethodSource("canConstructSource")
  void testSolutionOne(String target, String[] strs, boolean expected) {
    boolean actual = CanConstruct.solution1(target, strs);
    assertEquals(expected, actual);
  }

  @ParameterizedTest(name = "solution two: if {0} can be constructed with the strings from {1}: {2}")
  @MethodSource({"canConstructSource", "canConstructSourceWithBig"})
  void testSolutionTwo(String target, String[] strs, boolean expected) {
    boolean actual = CanConstruct.solution2(target, strs);
    assertEquals(expected, actual);
  }

  @ParameterizedTest(name = "solution two: if {0} can be constructed with the strings from {1}: {2}")
  @MethodSource({"canConstructSource", "canConstructSourceWithBig"})
  void testSolutionThree(String target, String[] strs, boolean expected) {
    boolean actual = CanConstruct.solution3(target, strs);
    assertEquals(expected, actual);

  }

  static Stream<Arguments> canConstructSource() {
    return Stream.of(
      Arguments.arguments("", new String[]{"a", "b", "c"}, true),
      Arguments.arguments(
        "abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}, true
      ),
      Arguments.arguments(
        "bcde", new String[]{"ab", "abc", "cd", "def", "abcd"}, false
      ),
      Arguments.arguments(
        "skateboard", new String[]{"bo", "rd", "a", "te", "t", "ska", "sk", "boa"}, true
      ),
      Arguments.arguments(
        "skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}, false
      )
    );
  }

  static Stream<Arguments> canConstructSourceWithBig() {
    return Stream.of(
      Arguments.arguments(
        "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", 
        new String[]{"e",
          "ee",
          "eee",
          "eeee",
          "eeeee",
          "eeeeee"}, 
        false
      ),
      Arguments.arguments(
        "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", 
        new String[]{"e", "f"}, 
        true
      )
    );
  }
}

