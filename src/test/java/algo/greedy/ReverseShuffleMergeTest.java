package algo.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test greedy/ReverseShuffleMerge")
public class ReverseShuffleMergeTest {
  
  @ParameterizedTest(name = "{1} is the minimal string to form {0} by reverse, shuffle and merge")
  @MethodSource("dataSource")
  void testSolution(String s, String expected) {
    assertEquals(expected, ReverseShuffleMerge.solution(s));
  }

  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments("eggegg", "egg"),
      Arguments.arguments("abcdefgabcdefg", "agfedcb"),
      Arguments.arguments("aeiouuoiea", "aeiou"),
      Arguments.arguments("bdabaceadaedaaaeaecdeadababdbeaeeacacaba", "aaaaaabaaceededecbdb")
    );
  }
}
