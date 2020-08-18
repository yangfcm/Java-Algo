package algo.string;

import java.util.*;

/*
 * Anagram: Check to see if two provided strings are anagrams of each other. One
 * string is an anagram of the other if it uses the same characters in the same
 * quantity. Requirements: only conside characters, not spaces or punctuation or number. Conside capital
 * letters to be the same as lower case e.g. anagrams('rail safety', 'fairy
 * tales') --> true anagrams('RAIL! SAFETY!', 'fairy tales') --> true
 * angagrams('Hi, there', 'Bye, there') --> false
 */
public class Anagrams {
  private static String cleanString(String str) {
    String pattern = "\\W";
    String clearedStr = str.replaceAll(pattern, "");
    return clearedStr.toLowerCase();
  }

  /**
   * Sort a string on alphabetic order and return the sorted string
   * e.g.'sad'->'ads'
   */
  private static String Alphabetize(String str) {
    String[] strArr = cleanString(str).split("");
    Arrays.sort(strArr);
    return String.join("", strArr);
  }

  /**
   * Convert a string to a character map. Its key is the character in the string
   * and its value is the number of occurrence for the charcter e.g. bool => {"b":
   * 1, "o": 2, "l": 1}
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

  /*
   * Solution 1: Split string to array, sort it alphabetically and joint it back
   * to a string Then compare the two strings
   */
  public static boolean runSolutionOne(String str1, String str2) {
    var sortedStr1 = Alphabetize(str1);
    var sortedStr2 = Alphabetize(str2);
    return sortedStr1.equals(sortedStr2);
  }

  /*
   * Solution 2: Remove spaces, punctuations from strings(use regular expression)
   * and covert strings to lower case Create two character maps(object) of both
   * strings, just as what we did in maxchar.js Compare the length of two
   * character maps and their values.
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