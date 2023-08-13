package algo.string;

import java.util.HashMap;

/**
 * @name FirstUniqueChar
 * @description Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * @example "leetcode" -> 0 (letter l is the first character, whose index is 0)
 * "loveleetcode" -> 2 (letter v)
 * "aabb" -> -1 (No unique character)
 * @source https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class FirstUniqueChar {

  /**
   * @description Use a character map(object) to record the number of each character.
   * Then iterate each character in the string, for the first character whose count is 1, return its index;
   * otherwise return -1 (no unique character)
   * @param str
   * @return The index of first unique character in a string
  */
  public static int solution(String str) {
    var charMap = new HashMap<Character, Integer>();
    var charArray = str.toCharArray();
    for(char ch: charArray) {
      if(charMap.containsKey(ch) == true) {
        charMap.put(ch, charMap.get(ch) + 1);
      } else {
        charMap.put(ch, 1);
      }
    }

    for(int i = 0; i < charArray.length; i++ ) {
      if(charMap.get(charArray[i]) == 1) {
        return i;
      }
    }
    return -1;
  }
}