package algo.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/IsBalanced")
public class IsBalancedTest {
  @ParameterizedTest(name = "String {0} is balanced")
  @ValueSource(strings = { "{}{}", "{foo}", "foo { bar { baz } boo }" })
  void testIsBalanced(String str) {
    assertTrue(IsBalanced.Solution(str));
  }

  @ParameterizedTest(name = "String {0} is NOT balanced")
  @ValueSource(strings = { "}{", "{{}", "foo { bar } }", "foo { bar { baz }" })
  void testIsNotBalanced(String str) {
    assertFalse(IsBalanced.Solution(str));
  }
}