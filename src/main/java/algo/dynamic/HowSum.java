package algo.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @name HowSum
 * @description Given an array of numbers and a target number, return an array containing 
* any (one) combination of elements that add up to exactly the target sum.
* If there is no combination that adds up to the target sum, return null.
* You may use an element of the array as many times as needed.
* Assum all input numbers are non-negative.
* It is a follow-up problem to CanSum.
 */
public class HowSum {
  /**
   * solution1
   * @param target
   * @param numbers
   * @return A list of one combination of numbers that add up to the target sum.
   * @implNote Use recursive
   */
  static public List<Integer> solution1(int target, int[] numbers) {
    if(target == 0) return new ArrayList<Integer>();  // If target is 0, return empty list
    if(target < 0) return null; // If target < 0, return null.
    for(int n: numbers) {
      int remain = target - n;
      var sums = solution1(remain, numbers);
      if(sums != null) {
        sums.add(n);
        return sums;
      }
    }
    return null;
  }

  /**
   * solution2
   * @param target
   * @param numbers
   * @return A list of one combination of numbers that add up to the target sum.
   * @implNote recursive + memoization
   */
  static public List<Integer> solution2(int target, int[] numbers) { 
    return solution2(target, numbers, new HashMap<Integer, List<Integer>>());
  }

  static public List<Integer> solution2(int target, int[] numbers, Map<Integer, List<Integer>> memo) {
    if(target == 0) return new ArrayList<Integer>();
    if(target < 0) return null;
    if(memo.containsKey(target)) return memo.get(target);
    for(int num: numbers) {
      int remain = target - num;
      var sums = solution2(remain, numbers, memo);
      if(sums != null) {
        sums.add(num);
        memo.put(target, sums);
        return sums;
      }
    }
    memo.put(target, null);
    return null;
  }

  /**
   * solution3
   * @param target
   * @param numbers
   * @return A list of one combination of numbers that add up to the target sum.
   * @implNote recursive + tabulation
   */
  static public List<Integer> solution3(int target, int[] numbers) {
    var sumsArr = new ArrayList<List<Integer>>();
    for(int i = 0; i <= target; i++) {
      sumsArr.add(null);
    }
    sumsArr.set(0, new ArrayList<Integer>());
    for(int i = 0; i <= target; i++) {
      if(sumsArr.get(i) != null) {
        for(int num: numbers) {
          if(i + num <= target) {
            var newSums = new ArrayList<Integer>(sumsArr.get(i));
            newSums.add(num);
            sumsArr.set(i+ num, newSums);
          }
        }
      }    
    }
    return sumsArr.get(target);
  }
}
