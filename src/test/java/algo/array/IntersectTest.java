package algo.array;

import java.util.stream.Stream;

import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test array/Intersect")
public class IntersectTest {
  private static int[][] testCase1 = { new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }, new int[] { 4, 9 } };
  private static int[][] testCase2 = { new int[] { 1, 1, 1, -2, -2, 5, 8, 9 }, new int[] { 1, 1, -2, 9, 10 },
      new int[] { 1, 1, -2, 9 } };

  @ParameterizedTest(name = "Intersect of {0} and {1} should be {2}")
  @MethodSource("IntersectTestSource")
  void testIntersect(int[] nums1, int[] nums2, int[] expected) {
    List<Integer> intersect = Intersect.solution(nums1, nums2);
    for (int i = 0; i < intersect.size(); i++) {
      assertEquals((int) intersect.get(i), expected[i]);
    }
  }

  static Stream<Arguments> IntersectTestSource() {
    return Stream.of(Arguments.arguments(testCase1[0], testCase1[1], testCase1[2]),
        Arguments.arguments(testCase2[0], testCase2[1], testCase2[2]));
  }
}
