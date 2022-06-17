package algo.assorted;

/**
 * @name DrawPyramid
 * @description Write a function that accepts a position number and print a pyramid shape with N levels,
 * using # character and space(s) on both left and right side.
 * @example
 *   pyramid(1)
 *       '#'
 *   pyramid(2)
 *       ' # '
 *       '###'
 *   pyramid(3)
 *       '  #  '
 *       ' ### '
 *       '#####'
 */
public class DrawPyramid {
  /**
   * 
   * @param n
   * @solution From 0 to n(iterate through rows)
   *   Create an empty string, 'level'
   *   From 0 to 2n-1 (columns)
   *   IF the column should have a '#'
   *     Add a '#' to 'level'
   *   ELSE
   *     Add a space to 'level'
   * print 'level'
   */
  public static void solution(int n) {
    for (int i = 1; i <= n; i++) {
      String level = "";
      for (int j = 1; j <= (2 * n - 1); j++) {
        if (j >= n - i + 1 && j <= n + i - 1) {
          level += "#";
        } else {
          level += " ";
        }
      }
      System.out.println(level);
    }
  }
}
