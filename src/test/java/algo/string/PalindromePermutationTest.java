package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test string/PalindromePermutation")
public class PalindromePermutationTest {
  @ParameterizedTest(name = "{0} should have permutation of palindrome")
  @MethodSource("trueDataSource")
  void testSolutionTrue(String str) {
    assertTrue(PalindromePermutation.solution(str));
  }

  @ParameterizedTest(name = "{0} should not have permutation of palindrome")
  @MethodSource("falseDataSource")
  void testSolutionFalse(String str) {
    assertFalse(PalindromePermutation.solution(str));
  }

  static Stream<Arguments> trueDataSource() {
    return Stream.of(Arguments.arguments("Tact coa"), Arguments.arguments("aaaabbbbbbccdde"));
  }

  static Stream<Arguments> falseDataSource() {
    return Stream.of(Arguments.arguments("Tact coaa"), Arguments.arguments("abcdabcdcd"));
  }
}
