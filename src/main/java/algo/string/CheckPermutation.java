package algo.string;

import java.util.*;

/**
 * @name CheckPermutation
 * @description Given two strings, check if one is a permutation of the other.
 * The problem is very similar to "anagrams".
 */
public class CheckPermutation {
  /**
   * @param str1
   * @param str2
   * @return True if str1 is a permutation of str2, otherwise false.
   * @solution Create character maps for both str1 and str2 and compare them.
   * If each character has the same value(count of characters), they are permutation,
   * otherwise, they are not.
   */
  public static boolean solution(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    HashMap<Character, Integer> charMap1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> charMap2 = new HashMap<Character, Integer>();
    for (int i = 0; i < str1.length(); i++) {
      Character ch1 = str1.charAt(i);
      Character ch2 = str2.charAt(i);
      if (charMap1.containsKey(ch1)) {
        charMap1.put(ch1, charMap1.get(ch1) + 1);
      } else {
        charMap1.put(ch1, 1);
      }
      if (charMap2.containsKey(ch2)) {
        charMap2.put(ch2, charMap2.get(ch2) + 1);
      } else {
        charMap2.put(ch2, 1);
      }
    }
    for (Map.Entry<Character, Integer> e : charMap1.entrySet()) {
      if (!charMap2.containsKey(e.getKey()) || charMap2.get(e.getKey()) != charMap1.get(e.getKey())) {
        return false;
      }
    }
    return true;
  }
}
