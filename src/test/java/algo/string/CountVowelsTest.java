package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/CountVowels")
public class CountVowelsTest {
  @ParameterizedTest(name = "The string of {0} should have {1} vowels")
  @MethodSource("dataSource")
  void testSolution(String str, int expected) {
    assertEquals(CountVowels.solution(str), expected);
  }

  static Stream<Arguments> dataSource() {
    String str1 = "apple";
    int count1 = 2;

    String str2 = "John SMITH";
    int count2 = 2;

    String str3 = "Why?";
    int count3 = 0;
    return Stream.of(Arguments.arguments(str1, count1), Arguments.arguments(str2, count2),
        Arguments.arguments(str3, count3));
  }
}
