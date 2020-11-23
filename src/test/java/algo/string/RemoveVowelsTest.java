package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/RemoveVowels")
public class RemoveVowelsTest {
  @ParameterizedTest(name = "The string of {0} without vowels should be {1}")
  @MethodSource("dataSource")
  void testSolution(String orgStr, String expected) {
    assertEquals(RemoveVowels.solution(orgStr), expected);
  }

  static Stream<Arguments> dataSource() {
    String str1 = "apples";
    String expected1 = "ppls";

    String str2 = "UMBERALLA";
    String expected2 = "MBRLL";

    String str3 = "fly";
    String expected3 = "fly";

    String str4 = "aEIou";
    String expected4 = "";

    return Stream.of(Arguments.arguments(str1, expected1), Arguments.arguments(str2, expected2),
        Arguments.arguments(str3, expected3), Arguments.arguments(str4, expected4));
  }
}
