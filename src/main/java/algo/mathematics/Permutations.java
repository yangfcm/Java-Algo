package algo.mathematics;

import java.util.*;

/**
 * @name Permutations
 * @description Given an array of distinct integers, return all the possible permutations.
 * @example arr = [1, 2, 3] ->
 * [
 *  [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]
 * ]
 * @source https://leetcode.com/problems/permutations/
 */
public class Permutations {
  public static List<List<Integer>> solution(Integer[] arr) {
    List<List<Integer>> permutations = new ArrayList<List<Integer>>();
    
    if(arr.length == 0) return new ArrayList<List<Integer>>();
    if(arr.length == 1) {
      var oneElementPermutation = new ArrayList<List<Integer>>();
      oneElementPermutation.add(Arrays.asList(arr));
      return oneElementPermutation;
    }

    for(int i = 0; i < arr.length; i++) {
      var currentNum = arr[i];
      var leftSubArr = Arrays.copyOfRange(arr, 0, i);
      var rightSubArr = Arrays.copyOfRange(arr, i+1, arr.length);
      var remainingNumbers = new Integer[leftSubArr.length + rightSubArr.length];
      System.arraycopy(leftSubArr, 0, remainingNumbers, 0, leftSubArr.length);
      System.arraycopy(rightSubArr, 0, remainingNumbers, leftSubArr.length, rightSubArr.length);
      var remainingNumbersPermuted = solution(remainingNumbers);
      for(int j = 0; j < remainingNumbersPermuted.size(); j++) {
        var foundPermutation = new ArrayList<Integer>();
        foundPermutation.add(currentNum);
        for(int k = 0; k < remainingNumbersPermuted.get(j).size(); k++) {
          foundPermutation.add(remainingNumbersPermuted.get(j).get(k));
        }
        permutations.add(foundPermutation);
      }
    }
    return permutations;
  }
}