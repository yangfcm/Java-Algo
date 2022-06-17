package algo.string;

import java.util.*;

/**
 * @name IsUnique
 * @description Given a string, determine if it has all unique characters.
 */
public class IsUnique {
  /**
   * @param str
   * @returns true if str has all unique characters, otherwise false.
   * @solution Create a character map(object) to record the count each character of the string.
   * Then iterate the object to see if there is a character with the count > 1
   */
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