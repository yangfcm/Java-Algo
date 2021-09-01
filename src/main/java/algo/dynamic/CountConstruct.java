package algo.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * @name CountConstruct
 * @description Given a target string and an array of strings.
 * The function should return the number of ways that the target can be
 * constructed by concatenating elements of the strs array.
 * You may use elements in strs as many times as needed.
 * e.g. countConstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl' ]) -> 2 i.e. 'purp' + 'le', 'p'+'ur'+'p'+'le'
*/
public class CountConstruct {

  /**
   * solution1
   * @param target
   * @param strs
   * @return the number of ways target can be constructed with strings from strs
   * @implNote Use recursive
   */
  static public int solution1(String target, String[] strs) { 
    int count = 0;
    if(target.equals("")) return 1;
    for(String str: strs) {
      if(target.indexOf(str) == 0) {
        int countForRest = solution1(target.substring(str.length()), strs);
        count += countForRest;
      }
    }
    return count;
  }

  /**
   * solution2
   * @param target
   * @param strs
   * @return the number of ways target can be constructed with strings from strs
   * @implNote Use recursive + memoization
   */
  static public int solution2(String target, String[] strs) {
    return solution2(target, strs, new HashMap<String, Integer>());
  }

  static public int solution2(String target, String[] strs, Map<String, Integer> memo) {
    int count = 0;
    if(target.equals("")) return 1;
    if(memo.containsKey(target)) return memo.get(target);
    for(String str: strs) {
      if(target.indexOf(str) == 0) {
        int countForRest = solution2(target.substring(str.length()), strs, memo);
        count += countForRest;
      }
    }
    memo.put(target, count);
    return count;
  }

  /**
   * solution3
   * @param target
   * @param strs
   * @return the number of ways target can be constructed with strings from strs
   * @implNote Use recursive + tabulation
   */
  static public int solution3(String target, String[] strs) {
    var table = new int[target.length() + 1];
    table[0] = 1;
    for(int i = 0; i < target.length(); i++) {
      for(String str: strs) {
        if(i + str.length() <= target.length() && 
          target.substring(i, i+str.length()).equals(str)){
            table[i+str.length()] += table[i];
        }
      }
    }
    return table[target.length()];
  }

}
