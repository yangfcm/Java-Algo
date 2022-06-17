package algo.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @name BestSum
 * @description Given an array of numbers and a target number, return an array containing 
 * the shortest combination of numbers that add up to exactly the target sum.
 * If there is no combination that adds up to the target sum, return null.
 * You may use an element of the array as many times as needed.
 * Assum all input numbers are non-negative.
 * It is a follow-up problem to CanSum and HowSum.
 * @example target = 7, numbers = [2, 3] ->[2, 3, 2]
 * target = 7, numbers = [5, 3, 4, 7] -> [7] There are two possible combinations: [3, 4] and [7] but [7] has only one element, which is the answer.
 */
public class BestSum {
  
  /**
   * @param target
   * @param numbers
   * @return The shortest combination of numbers that add up to exactly the target sum.
   * @implNote Use recursive
   */
  static public List<Integer> solution1(int target, int[] numbers) {
    if(target == 0) return new ArrayList<Integer>();  // If target is 0, return empty list
    if(target < 0) return null; // If target < 0, return null.

    List<Integer> shortestCombination = null;

    for(int n: numbers) {
      int remain = target - n;
      var sums = solution1(remain, numbers);
      if(sums != null) {
        sums.add(n);
        if(shortestCombination == null || sums.size() < shortestCombination.size()) {
          shortestCombination = sums;
        } 
      }
    }
    return shortestCombination;
  }

  /**
   * @param target
   * @param numbers
   * @return The shortest combination of numbers that add up to exactly the target sum.
   * @implNote Use recursive + memoization
   */
  static public List<Integer> solution2(int target, int[] numbers) {
    return solution2(target, numbers, new HashMap<Integer, List<Integer>>());
  }

  static public List<Integer> solution2(int target, int[] numbers, Map<Integer, List<Integer>> memo) {
    if(target == 0) return new ArrayList<Integer>();
    if(target < 0) return null;
    if(memo.containsKey(target)) return memo.get(target);

    List<Integer> shortestCombination = null;

    for(int num: numbers) {
      int remain = target - num;
      var sums = solution2(remain, numbers, memo);
      if(sums != null) {
        var newSums = new ArrayList<Integer>(sums);
        newSums.add(num);
        if(shortestCombination == null || sums.size() < shortestCombination.size()) {
          shortestCombination = newSums;
        }
      }
    }
    memo.put(target, shortestCombination);
    return shortestCombination;
  }

  /**
   * @param target
   * @param numbers
   * @return The shortest combination of numbers that add up to exactly the target sum.
   * @implNote Use recursive  + tabulation
   */
  static public List<Integer> solution3(int target, int[] numbers) {
    if(target < 0) return null;
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
            if(sumsArr.get(i+num) == null || newSums.size() < sumsArr.get(i+num).size())
            sumsArr.set(i+ num, newSums);
          }
        }
      }    
    }
    return sumsArr.get(target);
  }
}
