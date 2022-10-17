package algo.greedy;

import java.util.Arrays;

/**
 * @name luckBalance
 * @description  There is an array to represent a series of contests.
 * Each element(contest) is also an array which has two integer numbers.
 * The first number is the luck point; the second is 1 or 0 to indicate if the contest is important or not.
 * The rule is if you lose the contest, you can earn the luck point; if you win the contest, you will lose the luck point.
 * You cannot lose more than k importnat contests.
 * Given k and contests arrays, work out the maximum luck points you can earn. * 
 * @example k = 3, contests = [[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]] -> 29
 * There are 6 contests, 4 of which are important and you cannot lost more than k=3 of them.
 * You can get the maximum luck balance by losing all unimportant contests(index = 4, 5) and the first, second and fourth(index = 0, 1, 3) important contests.
 * So the total luck balance is 5 + 2 - 1 + 8 + 10 + 5 = 29.
 * @source https://www.hackerrank.com/challenges/luck-balance
 */
public class LuckBalance {
  
  /**
   * @param k
   * @param contests
   * @return The maximum luck balance achievable
   * @solution To achieve the maximum luck balance, you need to lose as many contests as possible.
   * First, you can lost all unimportant contests.
   * Second, among important contests, lose k contests which have the highest luck point number.
   */
  public static int solution(int k, int[][] contests) {
    int maxLuck = 0;
    int importantLost = 0;
    Arrays.sort(contests, (a, b) -> Integer.compare(b[0], a[0])); // Sort contests by the luck points from high to low.

    for(int[] contest: contests) {
      if(contest[1] == 0) {
        // You can lose unimportant contests as many as you want.
        maxLuck += contest[0];
        continue;
      }

      if(importantLost < k) {
        // Lose important contest
        maxLuck += contest[0];
        importantLost++;
      } else {
        // If k important contests are lost, you will have to win the rest important contests.
        maxLuck -= contest[0];
      }
    }

    return maxLuck;
  }
}
