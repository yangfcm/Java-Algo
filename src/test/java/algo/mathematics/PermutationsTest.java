package algo.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Mathematics/Permutations")
public class PermutationsTest {

  @ParameterizedTest(name = "Test case 1")
  @MethodSource("dataSource")
  void testSolution(Integer[] arr, int length, ArrayList<ArrayList<Integer>> expected) {
    var actual = Permutations.solution(arr);
    assertEquals(length, actual.size());
    for(int i = 0; i < actual.size(); i++) {
      assertArrayEquals(expected.get(i).toArray(), actual.get(i).toArray()); 
    }
  }
  
  static Stream<Arguments> dataSource() {
    Integer[] arr1 = {1,2,3};
    var expected1 = new ArrayList<ArrayList<Integer>>(
      Arrays.asList(
        new ArrayList<Integer>(Arrays.asList(1, 2, 3)),
        new ArrayList<Integer>(Arrays.asList(1, 3, 2)),
        new ArrayList<Integer>(Arrays.asList(2, 1, 3)),
        new ArrayList<Integer>(Arrays.asList(2, 3, 1)),
        new ArrayList<Integer>(Arrays.asList(3, 1, 2)),
        new ArrayList<Integer>(Arrays.asList(3, 2, 1))
      )
    );
    int length1 = 6;

    Integer[] arr2 = {1, 2, 3, 4};
    var expected2 = new ArrayList<ArrayList<Integer>>(
      Arrays.asList(
        new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)),
        new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3)),
        new ArrayList<Integer>(Arrays.asList(1, 3, 2, 4)),
        new ArrayList<Integer>(Arrays.asList(1, 3, 4, 2)),
        new ArrayList<Integer>(Arrays.asList(1, 4, 2, 3)),
        new ArrayList<Integer>(Arrays.asList(1, 4, 3, 2)),
        new ArrayList<Integer>(Arrays.asList(2, 1, 3, 4)),
        new ArrayList<Integer>(Arrays.asList(2, 1, 4, 3)),
        new ArrayList<Integer>(Arrays.asList(2, 3, 1, 4)),
        new ArrayList<Integer>(Arrays.asList(2, 3, 4, 1)),
        new ArrayList<Integer>(Arrays.asList(2, 4, 1, 3)),
        new ArrayList<Integer>(Arrays.asList(2, 4, 3, 1)),
        new ArrayList<Integer>(Arrays.asList(3, 1, 2, 4)),
        new ArrayList<Integer>(Arrays.asList(3, 1, 4, 2)),
        new ArrayList<Integer>(Arrays.asList(3, 2, 1, 4)),
        new ArrayList<Integer>(Arrays.asList(3, 2, 4, 1)),
        new ArrayList<Integer>(Arrays.asList(3, 4, 1, 2)),
        new ArrayList<Integer>(Arrays.asList(3, 4, 2, 1)),
        new ArrayList<Integer>(Arrays.asList(4, 1, 2, 3)),
        new ArrayList<Integer>(Arrays.asList(4, 1, 3, 2)),
        new ArrayList<Integer>(Arrays.asList(4, 2, 1, 3)),
        new ArrayList<Integer>(Arrays.asList(4, 2, 3, 1)),
        new ArrayList<Integer>(Arrays.asList(4, 3, 1, 2)),
        new ArrayList<Integer>(Arrays.asList(4, 3, 2, 1))
      )
    );
    int length2 = 24;
    return Stream.of(
      Arguments.arguments(arr1, length1, expected1),
      Arguments.arguments(arr2, length2, expected2)
    );
  }
}
