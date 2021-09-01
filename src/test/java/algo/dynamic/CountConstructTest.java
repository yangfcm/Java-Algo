package algo.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Dynamic/CountConstruct")
public class CountConstructTest {

  @ParameterizedTest(name = "solution one: there are {2} ways to construct \"{0}\" using strings from {1}")
  @MethodSource("countConstructSource")
  void testSolutionOne(String target, String[] strs, int expected) {
    int actual = CountConstruct.solution1(target, strs);
    assertEquals(expected, actual);
  }

  @ParameterizedTest(name = "solution one: there are {2} ways to construct \"{0}\" using strings from {1}")
  @MethodSource({"countConstructSource", "countConstructSourceWithBig"})
  void testSolutionTwo(String target, String[] strs, int expected) {
    int actual = CountConstruct.solution2(target, strs);
    assertEquals(expected, actual);
  }

  @ParameterizedTest(name = "solution three: there are {2} ways to construct \"{0}\" using strings from {1}")
  @MethodSource({"countConstructSource", "countConstructSourceWithBig"})
  void testSolutionThree(String target, String[] strs, int expected) {
    int actual = CountConstruct.solution2(target, strs);
    assertEquals(expected, actual);
  }
  
  static Stream<Arguments> countConstructSource() {
    return Stream.of(
      Arguments.arguments("", new String[]{"a", "b", "c"}, 1),
      Arguments.arguments(
        "abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}, 1
      ),
      Arguments.arguments(
        "purple", new String[]{"purp", "p", "ur", "le", "purpl"}, 2
      ),
      Arguments.arguments("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}, 4),
      Arguments.arguments("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}, 0)
    );
  }

  static Stream<Arguments> countConstructSourceWithBig() {
    return Stream.of(
      Arguments.arguments(
        "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
        new String[] { "e",
          "ee",
          "eee",
          "eeee",
          "eeeee",
          "eeeeee"
        },
        0
      )
    );
  }
}
