package algo.string;

import java.util.Arrays;

/**
 * @name RemoveVowels
 * @description Given a string, remove the vowels from the string and return the string without vowels
 * @param {string} str
 * @returns {string} A sub-string of the str without vowels
 */
public class RemoveVowels {
  /**
   * @param str 
   * @return A sub-string of the str without vowels
   */
  static public String solution(String str) {
    String strWithoutVowels = "";
    Character[] vowels = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
    for (char l : str.toCharArray()) {
      if (!Arrays.stream(vowels).anyMatch(x -> x == l)) {
        strWithoutVowels += l;
      }
    }
    return strWithoutVowels;
  }
}
