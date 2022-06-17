package algo.string;

import java.util.*;

/**
 * @name MakeAnagrams
 * @description Given two strings, str1 and str2, determine the minimum number
 * of characters deletions required to make str1 and str2 anagrams.
 * The strings str1 and str2 consist of lowercase English letters [a-z].
 * @example 'abcd' and 'dcefg' -> 5 delete a, b from 'abcd' 
 * and delete e,f,g from 'dcefg' to make 'cd' and 'dc', which are anagrams. 
 * That is 5 deletions. 
 */
public class MakeAnagrams {
  private static String LETTERS = "abcdefghijklmnopqrstuvwxyz";

  /**
   * @param str
   * @return A character map.
   * @solution Convert a string to a character map. Its key is the character in the string
   * and its value is the number of occurrence for the charcter
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

  /**
   * @param str1
   * @param str2
   * @return The minimum number of characters deletions to make str1 and str2 anagrams.
   * @solution Use charMaps for str1 and str2, compare each key and increment the difference for each key.
   * The total difference is just the minmum deletions required to make str1 and str2 anagrams.
   */
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