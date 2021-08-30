package algo.dynamic;

import java.util.HashMap;

/**
 * @name CanSum
 * @description Given a target number and an array of numbers, 
 * find out if it is possible to generate the target sum using the numbers from the array. 
 * You may use an element of the array as many times as needed.
 */
public class CanSum {
  /**
   * @name solution1
   * @param target
   * @param numbers
   * @return true if the numbers from numbers array can sum up to target
   * @implNote Use recursive
   */
  static public boolean solution1(int target, int[] numbers) {
    if(target == 0) return true;
    if(target < 0) return false;
    for(int n: numbers) {
      int remain = target - n;
      if(solution1(remain, numbers)) return true;
    }
    return false;
  }

  /**
   * @name solution2
   * @param target
   * @param numbers
   * @return true if the numbers from numbers array can sum up to target
   * @implNote Use recursive + memoization
   */
  static public boolean solution2(int target, int[] numbers) {
    return solution2(target, numbers, new HashMap<Integer, Boolean>());
  }

  static public boolean solution2(int target, int[] numbers, HashMap<Integer, Boolean> memo) {
    if(target == 0) return true;
    if(target < 0) return false;
    if(memo.containsKey(target)) return memo.get(target);
    for(int n: numbers) {
      int remain = target - n;
      if(solution2(remain, numbers, memo)) {
        memo.put(target, true);
        return true;
      }
    }
    memo.put(target, false);
    return false;
  }

  /**
   * @name solution3
   * @param target
   * @param numbers
   * @return true if the numbers from numbers array can sum up to target
   * @implNote Use recursive + tabulation
   */
  static public boolean solution3(int target, int[] numbers) {
    var targetArr = new boolean[target+1];
    targetArr[0] = true;
    for(int i = 0; i <= target; i++) {
      if(targetArr[i]) {
        for(int n: numbers) {
          if(i + n <= target) { // Avoid out index the array.
            targetArr[i+n] = true;
          }
        }
      }
    }
    return targetArr[target];
  }
}
