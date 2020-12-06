package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/CheckPermutation")
public class CheckPermutationTest {
  @ParameterizedTest(name = "String {0} and string {1} are permutations")
  @MethodSource("permutationData")
  void testIsPermutation(String str1, String str2) {
    assertTrue(CheckPermutation.solution(str1, str2));
  }

  @ParameterizedTest(name = "String {0} and string {1} are not permutations")
  @MethodSource("notPermutationData")
  void testIsNotPermutation(String str1, String str2) {
    assertFalse(CheckPermutation.solution(str1, str2));
  }

  static Stream<Arguments> permutationData() {
    return Stream.of(Arguments.arguments("abcdefg", "dgfebca"), Arguments.arguments("abcdabcd", "ccaabbdd"));
  }

  static Stream<Arguments> notPermutationData() {
    return Stream.of(Arguments.arguments("pale", "bake"), Arguments.arguments("johnson", "john"),
        Arguments.arguments("pale", "pad"));

  }
}
