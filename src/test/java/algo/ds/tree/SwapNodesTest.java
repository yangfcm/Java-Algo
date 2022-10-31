package algo.ds.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test ds/tree/SwapNodes")
public class SwapNodesTest {

  @ParameterizedTest(name = "Method can swap nodes as expected.")
  @MethodSource("dataSource")
  void testSolution(int[][] indexes, int[] queries, ArrayList<int[]> expected) {
    var actual = SwapNodes.solution(indexes, queries);
    assertEquals(expected.size(), actual.size());
    for(int i = 0; i < expected.size(); i++) {
      assertArrayEquals(expected.get(i), actual.get(i));
    }
  }
  
  static Stream<Arguments> dataSource() {
    return Stream.of(
      Arguments.arguments(
        new int[][] {{2, 3}, {-1, -1}, {-1, -1}},
        new int[] {1, 1},
        new ArrayList<int[]>(Arrays.asList(
          new int[] {3, 1, 2},
          new int[] {2, 1, 3}
        ))
      ),
      Arguments.arguments(
        new int[][] {
          {2, 3}, 
          {4, -1}, 
          {5, -1},  
          {6, -1},
          {7, 8},
          {-1, 9},
          {-1, -1},
          {10, 11},
          {-1, -1},
          {-1, -1},
          {-1, -1},
        },
        new int[] {2, 4},
        new ArrayList<int[]>(Arrays.asList(
          new int[] {2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10},
          new int[] {2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11}
        ))
      ),
      Arguments.arguments(
        new int[][] {
          {2, 3},
          {4, 5},
          {6, -1},
          {-1, 7},
          {8, 9},
          {10, 11},
          {12, 13},
          {-1, 14},
          {-1, -1},
          {15, -1},
          {16, 17},
          {-1, -1},
          {-1, -1},
          {-1, -1},
          {-1, -1},
          {-1, -1},
          {-1, -1},
        },
        new int[] {2, 3},
        new ArrayList<int[]>(Arrays.asList(
          new int[] {14, 8, 5, 9, 2, 4, 13, 7, 12, 1, 3, 10, 15, 6, 17, 11, 16},
          new int[] {9, 5, 14, 8, 2, 13, 7, 12, 4, 1, 3, 17, 11, 16, 6, 10, 15}
        ))
      )
    );
  }
}
