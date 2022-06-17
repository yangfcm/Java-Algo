package algo.array;

/**
 * @name Matrix
 * @description Given an integer n and return a N x N spiral matrix.
 * @example matrix(2) ->
 *     [[1, 2],
 *      [4, 3]]
 *  matrix(3) ->
 *     [[1, 2, 3],
 *      [8, 9, 4],
 *      [7, 6, 5]]
 *  matrix(4) ->
 *     [[1,  2,  3, 4],
 *     [12, 13, 14, 5],
 *     [11, 16, 15, 6],
 *     [10,  9,  8, 7]]
 */
public class Matrix {
  /**
   * @param num
   * @return a N x N spiral matrix
   * @solution Create an empty array of arrays called 'results'
   * Create a counter variable, starting at 1
   * As long as (start column <= end column) and (start row <= end row)
   *   Loop from start column to end column
   *     At results[start_row][i] assign counter variable
   *     Increment counter
   *   Increment start row
   *   Loop from start row to end row
   *     At results[i][end_column assign counter variable]
   *     Increment counter
   *   Decrement end row
   *   ...repeat for other two sides
   */
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
