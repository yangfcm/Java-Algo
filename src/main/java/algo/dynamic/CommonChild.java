package algo.dynamic;

/**
 * @name CommonChild
 * @description A string is considered to be a child of another string if it can be formed by deleting 0 or more characters from the other string.
 * Given two strings of equal length, find out the longest string that can be constructed such that it is a child of both.
 * @example s1 = 'ABCD', s2 = 'ABDC'. These two strings have two children with maximum length 3.
 * They are 'ABC' and 'ABD'. They can be formed by eliminating either D or C from both strings.
 * @source https://www.hackerrank.com/challenges/common-child
 */
public class CommonChild {
  
  /**
   * @param s1
   * @param s2
   * @return The length of the longest string which is a common child of the two given strings.
   * @solution https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
   */
  public static int solution(String s1, String s2) {
    int[][] table = new int[s1.length() + 1][s2.length() + 1];
    for(int i = 1; i <= s1.length(); i++) {
      for(int j = 1; j <= s2.length(); j++) {
        if(s1.charAt(i-1) == s2.charAt(j-1)) {
          table[i][j] = table[i-1][j-1] + 1;
        } else {
          table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
        }
      }
    }
    return table[s1.length()][s2.length()];
  }
}
