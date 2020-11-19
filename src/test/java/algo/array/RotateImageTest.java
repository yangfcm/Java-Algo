package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Array/RotateImage")
public class RotateImageTest {
  @ParameterizedTest(name = "Matrix {0} rotated should be {1} ")
  @MethodSource("dataSource")
  void testSolution(int[][] matrix, int[][] expected) {
    int[][] actual = RotateImage.solution(matrix);
    for (int i = 0; i < expected.length; i++) {
      assertArrayEquals(actual[i], expected[i]);
    }
  }

  static Stream<Arguments> dataSource() {
    int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] rotated1 = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };

    int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    int[][] rotated2 = { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };

    int[][] matrix3 = { { 5, 1, 9, 11, 58 }, { 2, 4, 8, 10, 32 }, { 13, 3, 6, 7, 77 }, { 15, 14, 12, 16, 99 },
        { 0, 1, 5, 7, 9 } };
    int[][] rotated3 = { { 0, 15, 13, 2, 5 }, { 1, 14, 3, 4, 1 }, { 5, 12, 6, 8, 9 }, { 7, 16, 7, 10, 11 },
        { 9, 99, 77, 32, 58 } };
    return Stream.of(Arguments.arguments(matrix1, rotated1), Arguments.arguments(matrix2, rotated2),
        Arguments.arguments(matrix3, rotated3));
  }
}
