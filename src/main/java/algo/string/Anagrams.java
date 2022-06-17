package algo.string;

import java.util.*;

/**
 * @name Anagrams
 * @description Check to see if two provided strings are anagrams of each other.
 * One string is an anagram of the other if it uses the same characters in the same quantity.
 * Only conside characters, not spaces or punctuation.
 * Conside capital letters to be the same as lower case.
 * @example anagrams('rail safety', 'fairy tales') -> true
 * anagrams('RAIL! SAFETY!', 'fairy tales')  -> true
 * angagrams('Hi, there', 'Bye, there') -> false
 */
public class Anagrams {
  /**
   * @description Remove spaces, punctuations etc. from string and convert it to all lowercase letters.
   * @param str
   * @return A clean string. 
   */
  private static String cleanString(String str) {
    String pattern = "\\W";
    String clearedStr = str.replaceAll(pattern, "");
    return clearedStr.toLowerCase();
  }

  /**
   * @description Sort a string on alphabetic order and return the sorted string
   * @example 'sad'->'ads'
   * @param str
   * @return The alphabetically-ordered string.
   */
  private static String Alphabetize(String str) {
    String[] strArr = cleanString(str).split("");
    Arrays.sort(strArr);
    return String.join("", strArr);
  }

  /**
   * @description Convert a string to a character map. 
   * Its key is the character in the string and its value is the number of occurrence for the charcter
   * @example bool => {"b": 1, "o": 2, "l": 1}
   * @param str
   * @return A character map.
   */
  private static HashMap<Character, Integer> strToCharMap(String str) {
    String cleanStr = cleanString(str);
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    for (char letter : cleanStr.toCharArray()) {
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
   * @return True if str1 and str2 are anagrams of each other, otherwise false.
   * @solution Split string to array, sort it alphabetically and joint it back to a string Then compare the two strings
   */
  public static boolean runSolutionOne(String str1, String str2) {
    var sortedStr1 = Alphabetize(str1);
    var sortedStr2 = Alphabetize(str2);
    return sortedStr1.equals(sortedStr2);
  }

  /**
   * @param str1
   * @param str2
   * @return True if str1 and str2 are anagrams of each other, otherwise false.
   * @solution Remove spaces, punctuations from strings(use regular expression) and covert strings to lower case. 
   * Create two character maps of both strings and compare their values.
   */
  public static boolean runSolutionTwo(String str1, String str2) {
    var charMap1 = strToCharMap(str1);
    var charMap2 = strToCharMap(str2);
    if (charMap1.size() != charMap2.size()) {
      return false;
    }
    for (Character key : charMap1.keySet()) {
      if (charMap1.get(key) != charMap2.get(key)) {
        return false;
      }
    }
    return true;
  }
}