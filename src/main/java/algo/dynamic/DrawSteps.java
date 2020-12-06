package algo.dynamic;

/**
 * Accept a positive number n The function should console write a step shape
 * with n levels using # character. Make sure the step has spaces on the right
 * side.
 */
// e.g.!-- 2 =>
// '# '
// '##'
// 3 =>
// '# '
// '## '
// '###'
// 4 =>
// '# '
// '## '
// '### '
// '####'
public class DrawSteps {
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