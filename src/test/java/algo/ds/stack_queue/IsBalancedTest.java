package algo.ds.stack_queue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test ds/stack_queue/IsBalanced")
public class IsBalancedTest {

  @ParameterizedTest(name = "String {0} is tested as balanced")
  @MethodSource("IsBalancedTestSource")
  void testIsBalancedTrue(String str) {
    assertTrue(IsBalanced.solution(str));
  }

  
  @ParameterizedTest(name = "String {0} is tested as balanced")
  @MethodSource("NotBalancedTestSource")
  void testIsBalancedFalse(String str) {
    assertFalse(IsBalanced.solution(str));
  }

  static Stream<Arguments> IsBalancedTestSource() {
    return Stream.of(Arguments.arguments(
      "abce", "{[()]}", "{{[[(())]]}}", "{(([])[])[]}", "{(([])[])[]}[]"
    ));
  }

  static Stream<Arguments> NotBalancedTestSource() {
    return Stream.of(Arguments.arguments(
      "{[(])}", "{(([])[])[]]}"
    ));
  }
}
