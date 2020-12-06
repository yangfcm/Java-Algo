package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test String/OneAway")
public class StringRotationTest {
  @ParameterizedTest(name = "String {0} is the rotation of string {1}")
  @MethodSource("rotationData")
  void testIsRotation(String str1, String str2) {
    assertTrue(StringRotation.solution(str1, str2));
  }

  @ParameterizedTest(name = "String {0} is the rotation of string {1}")
  @MethodSource("notRotationData")
  void testIsNotRotation(String str1, String str2) {
    assertFalse(StringRotation.solution(str1, str2));
  }

  static Stream<Arguments> rotationData() {
    return Stream.of(Arguments.arguments("waterbottle", "erbottlewat"), Arguments.arguments("abcdefg", "defgabc"));
  }

  static Stream<Arguments> notRotationData() {
    return Stream.of(Arguments.arguments("waterbottle", "erbotllewat"), Arguments.arguments("abcdefg", ""));
  }

}
