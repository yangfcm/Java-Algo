package algo.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * @name CanConstruct
 * @description Given a target string and an array of strings.
 * The function should return a boolean indicating whether or not the target can be
 * constructed by concatenating elements of the strs array.
 * You may use elements in strs as many times as needed.
 * e.g. You can use elements in ["ab", "abc", "cd", "def", "abcd"] to construct string "abcdef" ("abc" + "def"), so function returns true
 * But there is no way to construct "abcef", so function returns false.
 */
public class CanConstruct {
  /**
   * solution1
   * @param target
   * @param strs
   * @return true or false if target string can be combined with the strings in strs
   * @implNote Use recursive
   */
  static public boolean solution1(String target, String[] strs) {
    if(target.equals("")) return true;
    for(String str: strs) {
      if(target.indexOf(str) == 0) {
        String suffix = target.substring(str.length());
        if(solution1(suffix, strs)) return true;
      }
    }
    return false;
  }
  
  /**
   * solution2
   * @param target
   * @param strs
   * @return true or false if target string can be combined with the strings in strs
   * @implNote Use recursive + memoization
   */
  static public boolean solution2(String target, String[] strs) {
    return solution2(target, strs, new HashMap<String, Boolean>());
  }

  static public boolean solution2(String target, String[] strs, Map<String, Boolean> memo) {
    if(target.equals("")) return true;
    if(memo.containsKey(target)) return memo.get(target);
    for(String str: strs) {
      if(target.indexOf(str) == 0) {
        String suffix = target.substring(str.length());
        if(solution2(suffix, strs, memo) == true){
          memo.put(target, true);
          return true;
        }
      }
    }
    memo.put(target, false);
    return false;
  }
  
  /**
   * solution3
   * @param target
   * @param strs
   * @return true or false if target string can be combined with the strings in strs
   * @implNote Use recursive + tabulation
   */
  static public boolean solution3(String target, String[] strs) {
    var table = new boolean[target.length() + 1];
    table[0] = true;
    for(int i = 0; i <= target.length(); i++) {
      if(table[i]) {
        for(String str: strs) {
          if(i + str.length() <= target.length() && 
            target.substring(i, i + str.length()).equals(str)) {
              table[i + str.length()] = true;
          }
        }
      }
    }
    return table[target.length()];
  }
}
