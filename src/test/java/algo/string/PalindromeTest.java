package algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test String/Palindrome")
public class PalindromeTest {
  @ParameterizedTest(name = "String {0} is a palindrome")
  @ValueSource(strings = { "racecar", "refer", "solos" })
  void testPalindromeTrue(String str) {
    assertTrue(Palindrome.Run(str));
  }

  @ParameterizedTest(name = "String {0} is NOT a palindrome")
  @ValueSource(strings = { "hello", "Racecar" })
  void testPalindromeFalse(String str) {
    assertFalse(Palindrome.Run(str));
  }
}
