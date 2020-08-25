package algo.string;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test String/Capitalize")
public class CapitalizeTest {

  @ParameterizedTest(name = "Solution one: the result of capitalizing string \"{0}\" is string \"{1}\" ")
  @MethodSource("capitalizeSource")
  void testCapitalizeSolutionOne(String str, String capStr) {
    System.out.println(Capitalize.SolutionOne(str));
    assertEquals(Capitalize.SolutionOne(str), capStr);
  }

  @ParameterizedTest(name = "Solution two: the result of capitalizing string \"{0}\" is string \"{1}\" ")
  @MethodSource("capitalizeSource")
  void testCapitalizeSolutionTwo(String str, String capStr) {
    System.out.println(Capitalize.SolutionOne(str));
    assertEquals(Capitalize.SolutionOne(str), capStr);
  }

  static Stream<Arguments> capitalizeSource() {
    String testStr1 = "hi there, how is it going?";
    String testCapStr1 = "Hi There, How Is It Going?";
    String testStr2 = "i love breakfast at bill miller bbq";
    String testCapStr2 = "I Love Breakfast At Bill Miller Bbq";
    return Stream.of(Arguments.arguments(testStr1, testCapStr1), Arguments.arguments(testStr2, testCapStr2));
  }
}