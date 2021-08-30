package algo.dynamic;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Dynamic/GridTraveler")
public class GridTravelerTest {
  
  @ParameterizedTest(name = "Solution one: traveler has has {2} routes on a  {0} by {1} grid ")
  @MethodSource("gridTravelerSource")
  void testGridTravelerSolutionOne(int m, int n, long expected) {
    assertEquals(GridTraveler.Solution1(m, n), expected);
  }

  @ParameterizedTest(name = "Solution two: traveler has has {2} routes on a  {0} by {1} grid ")
  @MethodSource("gridTravelerSource")
  void testGridTravelerSolutionTwo(int m, int n, long expected) {
    assertEquals(GridTraveler.Solution2(m, n), expected);
  }

  @ParameterizedTest(name = "Solution three: traveler has has {2} routes on a  {0} by {1} grid ")
  @MethodSource("gridTravelerSource")
  void testGridTravelerSolutionThree(int m, int n, long expected) {
    assertEquals(GridTraveler.Solution3(m, n), expected);
  }

  static Stream<Arguments> gridTravelerSource() {
    return Stream.of(
      Arguments.arguments(1, 1, 1),
      Arguments.arguments(2, 3, 3),
      Arguments.arguments(3, 2, 3),
      Arguments.arguments(3, 3, 6),
      Arguments.arguments(12, 13, 1352078)  
    );
  }

  static Stream<Arguments> gridTravelerSourceWithBigNumber() { 
    return Stream.of(
      Arguments.arguments(1, 1, 1),
      Arguments.arguments(2, 3, 3),
      Arguments.arguments(3, 2, 3),
      Arguments.arguments(3, 3, 6),
      Arguments.arguments(12, 13, 1352078),
      Arguments.arguments(18, 18, 2333606220L)
    );
  }
}
