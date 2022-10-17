package algo.dynamic;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Dynamic/CommonChild")
public class CommonChildTest {
  @ParameterizedTest(name = "String {0} and String {1}'s longest common child string's length is {2}")
  @MethodSource("commonChildSource")
  void testCommonChild(String s1, String s2, int expected) {
    assertEquals(expected, CommonChild.solution(s1, s2));
  }

  static Stream<Arguments> commonChildSource() {
    return Stream.of(
      Arguments.arguments("AA", "BB", 0),
      Arguments.arguments("HARRY", "SALLY", 2),
      Arguments.arguments("SHINCHAN", "NOHARAAA", 3),
      Arguments.arguments("OUDFRMYMAW", "AWHYFCCMQX", 2),
      Arguments.arguments("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC", 15)
    );
  }
}
