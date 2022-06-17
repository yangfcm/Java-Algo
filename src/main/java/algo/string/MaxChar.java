package algo.string;

import java.util.HashMap;
import java.util.Map;
/**
 * @name MaxChar
 * @description Given a string, return the character that is most commonly used in the string.
 * @example 'abccccccdd' -> c
 */
public class MaxChar {
  /**
   * @param str
   * @return A character that is mostly used in str.
   * @solution Create a character map(object) to record the count each character the string.
   * Example: 'aabccc' => {'a': 2, 'b': 1, 'c': 3} 
   * Then iterate the object and return the key with the largest value.
   */
  static public char solution(String str) {
    var charMap = new HashMap<Character, Integer>();
    int max = 0; // The count of the most-frequently-used character of a string
    Character maxChar = null; // The character that frequently appears in a string
    for (char letter : str.toCharArray()) {
      if (charMap.containsKey(letter) == true) {
        charMap.put(letter, charMap.get(letter) + 1);
      } else {

        charMap.put(letter, 1);
      }
    }

    for (Map.Entry<Character, Integer> set : charMap.entrySet()) {
      if (set.getValue() > max) {
        max = set.getValue();
        maxChar = set.getKey();
      }
    }

    return maxChar;
  }
}