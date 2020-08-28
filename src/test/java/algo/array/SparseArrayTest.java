package algo.array;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Array/SparseArray")
public class SparseArrayTest {

  @ParameterizedTest(name = "Compress a sparse array can produce compressed array")
  @MethodSource("dataSource")
  void testCompress(int[][] arr, int[][] compressed) {
    assertArrayEquals(SparseArray.compress(arr), compressed);
  }

  @ParameterizedTest(name = "De-compress a compressed array can produce original sparse array")
  @MethodSource("dataSource")
  void testUncompress(int[][] arr, int[][] compressed) {
    assertArrayEquals(SparseArray.decompress(compressed), arr);
  }

  static Stream<Arguments> dataSource() {
    int[][] arr1 = { { 0, 0, 0, 0 }, { 5, 8, 0, 0 }, { 0, 0, 3, 0 }, { 0, 6, 0, 0 } };
    int[][] compressed1 = { { 4, 4, 4 }, { 1, 0, 5 }, { 1, 1, 8 }, { 2, 2, 3 }, { 3, 1, 6 } };

    int[][] arr2 = new int[100][100];
    arr2[2][3] = 1;
    arr2[12][29] = 2;
    arr2[89][92] = 3;

    int[][] compressed2 = { { 100, 100, 3 }, { 2, 3, 1 }, { 12, 29, 2 }, { 89, 92, 3 } };

    return Stream.of(Arguments.arguments(arr1, compressed1), Arguments.arguments(arr2, compressed2));
  }
}