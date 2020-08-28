package algo.array;

/**
 * Problem: compress and de-compress a sparse array. A sparse array is a
 * two-dimensional array in which most of the elements are zero.
 */
public class SparseArray {
  /**
   * Compress a sparse array
   * 
   * @param int[][]
   * @return int[][]
   * @implNote 1 - Iterate the original sparce array, get the rows, columns and
   *           count of non-zero number. 2- Create and initialize compressed
   *           two-dimentional array. Its first row has three elements: rows of
   *           original array, columns of original array and count of non-zero
   *           number. 3- Iterate original array again, for each non-zero value,
   *           record its row, col and value in the compressed array
   */
  public static int[][] compress(int[][] arr) {
    int countOfValue = 0; // How many non-zero values in the array
    int rows = arr.length;
    int cols = arr[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] != 0) {
          countOfValue++;
        }
      }
    }
    int compressed[][] = new int[countOfValue + 1][3];
    compressed[0][0] = rows;
    compressed[0][1] = cols;
    compressed[0][2] = countOfValue;

    int index = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] != 0) {
          index++;
          compressed[index][0] = i;
          compressed[index][1] = j;
          compressed[index][2] = arr[i][j];
        }
      }
    }
    return compressed;
  }

  /**
   * Decompress an array compressed from a sparse array
   * 
   * @param int[][] compressed
   * @return int[][]
   * @implNote 1 - Read the first row of compressed array and get the rows, cols
   *           and count of non-zero value of the original array. 2- Create a
   *           two-dimensional array with rows and cols and fill it with zero.(In
   *           Java, its value is 0 by default) 3 - Iterate the compressed array
   *           and fill it with other values
   */
  public static int[][] decompress(int[][] compressed) {
    int decompressed[][] = new int[compressed[0][0]][compressed[0][1]];
    for (int i = 1; i < compressed.length; i++) {
      var row = compressed[i];
      decompressed[row[0]][row[1]] = row[2];
    }
    return decompressed;
  }
}