package algo.assorted;

/**
 * @name DrawSteps
 * @description Write a function that accepts a positive number n
 * The function should console log a step shape with n levels using # character.
 * Make sure the step has spaces on the right side
 * @example
 *   steps(2)
 *       '# '
 *       '##'
 *   steps(3)
 *       '#  '
 *       '## '
 *       '###'
 *   steps(4)
 *       '#   '
 *       '##  '
 *       '### '
 *       '####'
 */
public class DrawSteps {
  /**
   * @param n
   * @solution From 0 to n
   *   Create an empty string, 'stair'
   *   From 0 to n
   *     IF the current column is equal to or less than the current row
   *       Add a '#' to 'stair'
   *     ELSE
   *       Add a space to 'stair'
   *   print 'stair'
   */
  public static void solution(int n) {
    for (int i = 1; i <= n; i++) {
      String stair = "";
      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          stair += "#";
        } else {
          stair += " ";
        }
      }
      System.out.println(stair);
    }
  }
}
