package algo.array;

import java.util.HashSet;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be
 * validated according to the following rules: 1 - Each row must contain the
 * digits 1-9 without repetition. 2 - Each column must contain the digits 1-9
 * without repetition. 3 - Each of the 9 3x3 sub-boxes of the grid must contain
 * the digits 1-9 without repetition. The Sudoku board could be partially
 * filled, where empty cells are filled with the character '.'.
 */
// e.g. Input:
// [
// ["5","3",".",".","7",".",".",".","."],
// ["6",".",".","1","9","5",".",".","."],
// [".","9","8",".",".",".",".","6","."],
// ["8",".",".",".","6",".",".",".","3"],
// ["4",".",".","8",".","3",".",".","1"],
// ["7",".",".",".","2",".",".",".","6"],
// [".","6",".",".",".",".","2","8","."],
// [".",".",".","4","1","9",".",".","5"],
// [".",".",".",".","8",".",".","7","9"]
// ]
// Output: true
// Input:
// [
// ["8","3",".",".","7",".",".",".","."],
// ["6",".",".","1","9","5",".",".","."],
// [".","9","8",".",".",".",".","6","."],
// ["8",".",".",".","6",".",".",".","3"],
// ["4",".",".","8",".","3",".",".","1"],
// ["7",".",".",".","2",".",".",".","6"],
// [".","6",".",".",".",".","2","8","."],
// [".",".",".","4","1","9",".",".","5"],
// [".",".",".",".","8",".",".","7","9"]
// ]
// Output: false (There are two 8s in the first column)
public class ValidSudoku {
  static public boolean solution(String[][] board) {
    int n = 9;
    for (int i = 0; i < n; i++) {
      HashSet<String> row = new HashSet<String>();
      HashSet<String> col = new HashSet<String>();
      HashSet<String> box = new HashSet<String>();
      for (int j = 0; j < n; j++) {
        // Check if each row is valid
        if (!board[i][j].equals(".")) {
          if (!row.add(board[i][j])) {
            return false;
          }
        }

        if (!board[j][i].equals(".")) {
          // Check if each col is valid
          if (!col.add(board[j][i])) {
            return false;
          }
        }

        String boxEl = board[3 * (i / 3) + (j / 3)][3 * (i % 3) + (j % 3)];
        if (!boxEl.equals(".")) {
          // Check if each 3x3 box is valid.
          if (!box.add(boxEl)) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
