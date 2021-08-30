package algo.dynamic;

import java.util.HashMap;

/**
 * @name GridTraveler
 * @description Imagine that you are a traveler on a 2D grid.
 * You begin in the top-left corner and end in the bottom-right corner.
 * You may only move down or right.
 * Create algorithm to calculate how many routes you can travel to the goal on a grid with dimensions m*n.
 */
public class GridTraveler {

  /**
   * @name solution1
   * @param m 
   * @param n 
   * @return The number of routes the traveler has traveling from top-left corner to the bottom-right corner on a 2D grid.
   * @implNote  Use recursive
   */
  static public long solution1(int m, int n) {
    if(m == 1 && n == 1) return 1;
    if(m == 0 || n == 0) return 0;
    return solution1(m-1, n) + solution1(m, n-1);
  }

  /**
   * @name solution2
   * @param m 
   * @param n 
   * @return The number of routes the traveler has traveling from top-left corner to the bottom-right corner on a 2D grid.
   * @implNote Use recursive + memoization
   */
  static public long solution2(int m, int n) {
    return solution2(m, n, new HashMap<String, Long>());
  }

  static public long solution2(int m, int n, HashMap<String, Long> memo) {
    if (m == 1 && n == 1) return 1;
    if (m == 0 || n == 0) return 0;
    var key = m + "," + n;
    if(memo.containsKey(key)) return memo.get(key);
    memo.put(key, solution2(m - 1, n, memo) + solution2(m, n-1, memo));
    return memo.get(key);
  }

  /**
   * @name solution3
   * @param m
   * @param n
   * @return The number of routes the traveler has traveling from top-left corner to the bottom-right corner on a 2D grid.
   * @implNote Use recursive + tabulation
   */
  static public long solution3(int m, int n) {
    var travelArr = new long[m+1][n+1];
    travelArr[1][1] = 1;
    for(int i = 0; i <= m; i++) {
      for(int j = 0; j <= n; j++) {
        if(i <= 1 && j <= 1) continue;
        var prevRow = i >= 1 ? travelArr[i-1][j] : 0;
        var prevCol = j >= 1 ? travelArr[i][j-1] : 0;
        travelArr[i][j] = prevRow + prevCol;
      }
    }
    return travelArr[m][n];
  }
}
