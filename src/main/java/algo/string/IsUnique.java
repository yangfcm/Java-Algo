package algo.string;

import java.util.*;

/**
 * Given a string, determine if it has all unique characters. Solution: Create a
 * character map(object) to record the count each character of the string. Then
 * iterate the object to see if there is a character with the count > 1 Its
 * solution is similar to maxchar.js
 */
public class IsUnique {
  static public boolean solution(String str) {
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    for (char ch : str.toCharArray()) {
      if (charMap.containsKey(ch)) {
        return false;
      } else {
        charMap.put(ch, 1);
      }
    }
    return true;
  }
}