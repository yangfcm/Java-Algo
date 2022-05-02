package algo.dynamic;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test Dynamic/AllConstruct")
public class AllConstructTest {

  @ParameterizedTest(name = "solution one: the all possible combinations for \"{0}\" from {1} can be found")
  @MethodSource("allConstructSourceForSolution1")
  void testSolutionOne(String target, String[] strs, ArrayList<ArrayList<String>> expected){
    var actual = AllConstruct.solution1(target, strs);
    assertTrue(assert2DListsEqual(actual, expected));
  }

  @ParameterizedTest(name = "solution two: the all possible combinations for \"{0}\" from {1} can be found")
  @MethodSource("allConstructSourceForSolution2")
  void testSolutionTwo(String target, String[] strs, ArrayList<ArrayList<String>> expected){
    var actual = AllConstruct.solution2(target, strs);
    assertTrue(assert2DListsEqual(actual, expected));
  }

  @ParameterizedTest(name = "solution three: the all possible combinations for \"{0}\" from {1} can be found")
  @MethodSource("allConstructSourceForSolution3")
  void testSolutionThree(String target, String[] strs, ArrayList<ArrayList<String>> expected){
    var actual = AllConstruct.solution3(target, strs);
    assertTrue(assert2DListsEqual(actual, expected));
  }
  
  static Stream<Arguments> allConstructSourceForSolution1() {
    return Stream.of(
      Arguments.arguments(
        "purple", 
        new String[] { "purp", "p", "ur", "le", "purpl" },
        new ArrayList<ArrayList<String>>(Arrays.asList(
          new ArrayList<String>(Arrays.asList("purp", "le")),
          new ArrayList<String>(Arrays.asList("p", "ur", "p", "le"))
        ))
      ),
      Arguments.arguments(
        "abcdef",
        new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"},
        new ArrayList<ArrayList<String>>(Arrays.asList(
          new ArrayList<String>(Arrays.asList("ab", "cd", "ef")),
          new ArrayList<String>(Arrays.asList("ab", "c", "def")),
          new ArrayList<String>(Arrays.asList("abc", "def")),
          new ArrayList<String>(Arrays.asList("abcd", "ef"))
        ))
      )
    );
  }

  static Stream<Arguments> allConstructSourceForSolution2() {
    return Stream.of(
      Arguments.arguments(
        "purple", 
        new String[] { "purp", "p", "ur", "le", "purpl" },
        new ArrayList<ArrayList<String>>(Arrays.asList(
          new ArrayList<String>(Arrays.asList("purp", "le")),
          new ArrayList<String>(Arrays.asList("p", "ur", "p", "le"))
        ))
      ),
      Arguments.arguments(
        "abcdef",
        new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"},
        new ArrayList<ArrayList<String>>(Arrays.asList(
          new ArrayList<String>(Arrays.asList("ab", "cd", "ef")),
          new ArrayList<String>(Arrays.asList("ab", "c", "def")),
          new ArrayList<String>(Arrays.asList("abc", "def")),
          new ArrayList<String>(Arrays.asList("abcd", "ef"))
        ))
      )
    );
  }

  static Stream<Arguments> allConstructSourceForSolution3() {
    return Stream.of(
      Arguments.arguments(
        "purple", 
        new String[] { "purp", "p", "ur", "le", "purpl" },
        new ArrayList<ArrayList<String>>(Arrays.asList(
          new ArrayList<String>(Arrays.asList("purp", "le")),
          new ArrayList<String>(Arrays.asList("p", "ur", "p", "le"))
        ))
      ),
      Arguments.arguments(
        "abcdef",
        new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"},
        new ArrayList<ArrayList<String>>(Arrays.asList( // The order is different.
          new ArrayList<String>(Arrays.asList("abc", "def")),
          new ArrayList<String>(Arrays.asList("ab", "c", "def")),
          new ArrayList<String>(Arrays.asList("abcd", "ef")),
          new ArrayList<String>(Arrays.asList("ab", "cd", "ef"))
        ))
      )
    );
  }

  // static Stream<Arguments> allConstructSourceWithBig() {}

  private static <T> boolean assert2DListsEqual(ArrayList<ArrayList<T>> list1, ArrayList<ArrayList<T>> list2) {
    if(list1.size() != list2.size()) return false;
    for(int i = 0; i < list1.size(); i++) {
      if(!list1.get(i).equals(list2.get(i))) return false;
    }
    return true;
  } 
}
