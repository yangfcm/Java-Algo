package algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test String/MaxChar")
public class MaxCharTest {
  @DisplayName("MaxChar should return the mostly-used characters in a string")
  @Test
  public void testMaxChar() {
    String testStr1 = "abcdefghijklmnaaaaa";
    String testStr2 = "ab1c1d1e1f1g1";

    assertEquals(MaxChar.solution(testStr1), 'a');
    assertEquals(MaxChar.solution(testStr2), '1');
  }
}