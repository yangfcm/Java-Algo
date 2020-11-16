package algo.array;

/**
 * Write a function that accepts an integer n and returns a N x N spiral matrix.
 * (What is spiral matrix, see the example below)
 */
// e.g. matrix(2)
// [[1, 2],
// [4, 3]]
// matrix(3)
// [[1, 2, 3],
// [8, 9, 4],
// [7, 6, 5]]
// matrix(4)
// [[1, 2, 3, 4],
// [12, 13, 14, 5],
// [11, 16, 15, 6],
// [10, 9, 8, 7]]

public class Matrix {
  public static int[][] solution(int num) {
    int[][] matrixArr = new int[num][num];
    int startRow = 0;
    int startCol = 0;
    int endRow = num - 1;
    int endCol = num - 1;
    int counter = 1;
    while (startCol <= endCol && startRow <= endRow) {
      for (int i = startCol; i <= endCol; i++) {
        // Row from let to right
        matrixArr[startRow][i] = counter;
        counter++;
      }
      startRow++;
      for (int i = startRow; i <= endRow; i++) {
        // Column from top to bottom
        matrixArr[i][endCol] = counter;
        counter++;
      }
      endCol--;
      for (int i = endCol; i >= startCol; i--) {
        // Row from right to left
        matrixArr[endRow][i] = counter;
        counter++;
      }
      endRow--;
      for (int i = endRow; i >= startRow; i--) {
        // Column from bottom to top
        matrixArr[i][startCol] = counter;
        counter++;
      }
      startCol++;
    }
    return matrixArr;
  }
}
