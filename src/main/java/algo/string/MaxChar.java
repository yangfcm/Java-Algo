package algo.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Max character Give a string, return the character that is most commonly used
 * in the string
 */
public class MaxChar {
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