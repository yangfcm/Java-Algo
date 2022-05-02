package algo.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @name AllConstruct
 * @description Given a target string and an array of strings.
 * The function should return a list of arrays containing all of the ways that the target can be
 * constructed by concatenating elements of the strs array.
 * You may use elements in strs as many times as needed.
 */
public class AllConstruct {

  /**
   * solution1
   * @param target
   * @param strs
   * @return A list of all combinations to get the target string
   * @implNote Use recursive
   */
  static public ArrayList<ArrayList<String>> solution1(String target, String[] strs) {
    if(target.equals("")) { 
      return new ArrayList<ArrayList<String>>(){{
        add(new ArrayList<String>());
      }};
    }
    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>(); 
    for(String str: strs) {
      if(target.indexOf(str) == 0) {
        var suffix = target.substring(str.length());
        var suffixWays = solution1(suffix, strs);
        for(ArrayList<String> way: suffixWays) {
          way.add(0, str);
          result.add(way);
        }
      }
    }
    return result;
  }

  /**
   * solution2
   * @param target
   * @param strs
   * @return A list of all combinations to get the target string
   * @implNote Use recursive + memoization
   */
  static public ArrayList<ArrayList<String>> solution2(String target, String[] strs) {
    return solution2(target, strs, new HashMap<String, ArrayList<ArrayList<String>>>());
  }

  static public ArrayList<ArrayList<String>> solution2(
    String target, 
    String[] strs, 
    Map<String, ArrayList<ArrayList<String>>> memo) {
      if(target.equals("")) { 
        return new ArrayList<ArrayList<String>>(){{
          add(new ArrayList<String>());
        }};
      }
      if(memo.containsKey(target)) return memo.get(target);
      ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>(); 
      for(String str: strs) {
        if(target.indexOf(str) == 0) {
          String suffix = target.substring(str.length());
          ArrayList<ArrayList<String>> suffixWays = solution2(suffix, strs, memo);
          for(ArrayList<String> way: suffixWays) {
            way.add(0, str);
            result.add(way);
          }
        }
      }

      // deep clone the result and add it to memo map.
      var copyResult = new ArrayList<ArrayList<String>>();
      for(int i = 0; i < result.size(); i++) {
        copyResult.add(new ArrayList<String>(result.get(i)));
      }
      memo.put(target, copyResult);
      return result;
  }

  /**
   * solution3
   * @param target
   * @param strs
   * @return A list of all combinations to get the target string
   * @implNote Use recursive + tabulation
   */
  static public ArrayList<ArrayList<String>> solution3(String target, String[] strs) {
    var table = (ArrayList<ArrayList<String>>[]) new ArrayList[target.length()+1];
    for(int i = 0; i <= target.length(); i++) {
      table[i] = new ArrayList<ArrayList<String>>();
    }
    table[0].add(new ArrayList<String>());
    for(int i = 0; i <= target.length(); i++) {
      for(String str: strs) {
        if(i + str.length() <= target.length() && target.substring(i, i+str.length()).equals(str)) {
          for(ArrayList<String> sub: table[i]) {
            var newSub = new ArrayList<String>(sub) {
              {add(str);}
            };
            table[i + str.length()].add(newSub);
          }
        }
      }
    }
    return table[target.length()];
  }
}