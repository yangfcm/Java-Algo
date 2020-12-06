package algo.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/IsUnique")
public class IsUniqueTest {
  @ParameterizedTest(name = "String {0} has all unique characters")
  @ValueSource(strings = { "abcdefg", "AaBbCc", "holiday" })
  void testIsUnique(String str) {
    assertTrue(IsUnique.solution(str));
  }

  @ParameterizedTest(name = "String {0} has duplicate characters")
  @ValueSource(strings = { "abcda", "mississippi" })
  void testIsNotUnique(String str) {
    assertFalse(IsUnique.solution(str));
  }
}
