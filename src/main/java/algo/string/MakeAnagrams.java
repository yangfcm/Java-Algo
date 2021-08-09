package algo.string;

import java.util.*;

/**
 * @name makeAnagrams
 * @description Given two strings, str1 and str2, determine the minimum number
 *              of characters deletions required to make str1 and str2 anagrams.
 *              The strings str1 and str2 consist of lowercase English letters
 *              [a-z].
 * @example makeAnagrams('abcd','dcefg') -> 5 delete a, b from 'abcd' and delete
 *          e,f,g from 'dcefg' to make 'cd' and 'dc', which are anagrams. That
 *          is 5 deletions.
 * @link https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class MakeAnagrams {
  private static String LETTERS = "abcdefghijklmnopqrstuvwxyz";

  /**
   * Convert a string to a character map. Its key is the character in the string
   * and its value is the number of occurrence for the charcter e.g. bool => {"b":
   * 1, "o": 2, "l": 1}
   */
  private static HashMap<Character, Integer> strToCharMap(String str) {
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    for (char letter : str.toCharArray()) {
      var smallLetter = Character.toLowerCase(letter);
      if (charMap.get(smallLetter) == null) {
        charMap.put(smallLetter, 1);
      } else {
        charMap.put(smallLetter, charMap.get(smallLetter) + 1);
      }
    }
    return charMap;
  }

  public static int Solution(String str1, String str2) {
    int deletions = 0;
    var charMap1 = strToCharMap(str1);
    var charMap2 = strToCharMap(str2);
    for (char letter : LETTERS.toCharArray()) {
      int count1 = charMap1.get(letter) == null ? 0 : charMap1.get(letter);
      int count2 = charMap2.get(letter) == null ? 0 : charMap2.get(letter);
      deletions += Math.abs(count1 - count2);
    }
    return deletions;
  }
}