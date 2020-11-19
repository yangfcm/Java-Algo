package algo.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test array/Matrix")
public class MatrixTest {
  @DisplayName("Test matrix of size 2")
  @Test
  public void TestSize2() {
    int[][] matrix = Matrix.solution(2);
    int[][] expected = { new int[] { 1, 2 }, new int[] { 4, 3 } };
    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(matrix[i], expected[i]);
    }
  }

  @DisplayName("Test matrix of size 3")
  @Test
  public void TestSize3() {
    int[][] matrix = Matrix.solution(3);
    int[][] expected = { new int[] { 1, 2, 3 }, new int[] { 8, 9, 4 }, new int[] { 7, 6, 5 } };
    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(matrix[i], expected[i]);
    }
  }

  @DisplayName("Test matrix of size 4")
  @Test
  public void TestSize4() {
    int[][] matrix = Matrix.solution(4);
    int[][] expected = { new int[] { 1, 2, 3, 4 }, new int[] { 12, 13, 14, 5 }, new int[] { 11, 16, 15, 6 },
        new int[] { 10, 9, 8, 7 } };
    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(matrix[i], expected[i]);
    }
  }
}
