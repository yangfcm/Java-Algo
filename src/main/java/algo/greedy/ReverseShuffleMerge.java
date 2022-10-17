package algo.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @name ReverseShuffleMerge
 * @description We define some operations on a string as follows:
 * 1. Reverse, reverse a string e.g. Reverse 'abc' is 'cba'
 * 2. Shuffle, shuffle the characters in a string. e.g. Shuffle 'abc' can be 'abc', 'acb', 'bac', 'bca', 'cba', 'cab'
 * 3. Merge, intersperse two strings with maintaining the order of characters in both.
 * e.g. Merge 'abc' and 'def' can be 'abcdef', 'adbecf', 'abdefc', 'adefbc' etc.
 * Given a string s such that s is one of the results of the operation: merge(reverse(A), shuffle(A)) (A is another string)
 * find out the lexicographically smallest(字典排序中最小/前的一個) A
 * @example 
 * Example 1: s = eggegg -> egg
 * reverse('egg') -> 'gge', shuffle('egg') -> 'egg', 'eggegg' belongs to the merge of ('gge', 'egg')
 * Example 2: s = abcdefgabcdefg -> agfedcb
 * reverse('agfedcb') -> 'bcdefga', shuffle('agfedcb') -> 'abcdefg', 'bcdefgabcdefg' belongs to the merge of ('bcdefga','abcdefg')
 * @source https://www.hackerrank.com/challenges/reverse-shuffle-merge
 */
public class ReverseShuffleMerge {

  /**
   * @description Helper function: Sort characters in a given string.
   * @param str
   * @return a character-sorted string
   * @example str = 'apple' -> 'aelpp'
   */
  private static String sortString(String str) {
    char[] tempArr = str.toCharArray();
    Arrays.sort(tempArr);
    return new String(tempArr);
  }

  /**
   * @description Helper function: Reverse characters in a string
   * @param str
   * @return a character-reversed string
   * @example str = 'apple' -> 'elppa'
   */
  private static String reverseString(String str) {
    String reversedStr = "";
    for(int i = str.length() - 1; i >= 0; i--) {
      reversedStr += str.charAt(i);
    }
    return reversedStr;
  }

  /**
   * @description Helper function: Given a sorted string where each character appears even number times. Return a new string by halving it.
   * @param str
   * @return a halved string
   * @example str = 'aabbbbcc' -> 'abbc'
   */
  private static String halveString(String str) {
    String halvedStr = "";
    for(int i = 0; i < str.length(); i += 2) {
      halvedStr += str.charAt(i);
    }
    return halvedStr;
  }

  /**
   * @description Helper function: Convert a string to a character map. 
   * Its key is the character in the string and its value is the number of occurrence for the charcter
   * @example bool => {"b": 1, "o": 2, "l": 1}
   * @param str
   * @return A character map.
   */
  private static HashMap<Character, Integer> strToCharMap(String str) {
    HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
    for (char letter : str.toCharArray()) {
      if (charMap.get(letter) == null) {
        charMap.put(letter, 1);
      } else {
        charMap.put(letter, charMap.get(letter) + 1);
      }
    }
    return charMap;
  }

  /**
   * @description Helper function: Convert a list of characters to a string.
   * @example charList = ['a', 'p', 'p', 'l', 'e'] -> "apple"
   * @param charList
   * @return A string composed of characters in charList
   */
  private static String convertCharacterListToString(List<Character> charList) {
    StringBuilder str = new StringBuilder();
    for(Character ch: charList) {
      str.append(ch);
    }
    return str.toString();
  }
  
  /**
   * @param s
   * @return The lexicographically smallest string A from defined operations.
   * @solution Because s is the intersperse of two strings with exact same letters, we can easily find out the letters for string A.
   * To do it, use an object as char-count pair. For example, s = eggegg, we can know
   * string A has one letter 'e' and two letter 'g's, so keep the information in an object like: { e: 1, g: 2, }.
   * Next, we need to put these letters in correct order, such that s = merge(reverse(A), shuffle(A)).
   * Considering the characteristics of the string s, if we reverse the string, like 'ggegge', we can know that string A is contained in it with the right order.
   * So the task is to find one 'e' and two 'g's from 'ggegge' in the order. And the lexicographically smallest one is exactly the string A we want.
   */
  public static String solution(String s) {
    String halfSortedStr = halveString(sortString(s));
    HashMap<Character, Integer> letterCounts = strToCharMap(halfSortedStr);
    HashMap<Character, Integer> letterCountsShuffle = strToCharMap(halfSortedStr);
    String reversedStr = reverseString(s);

    List<Character> strArr = new ArrayList<Character>();
    for(int i = 0; i < reversedStr.length(); i++) {
      Character ch = reversedStr.charAt(i);
      if(letterCounts.get(ch) > 0) {
        while (
          strArr.size() > 0 &&
          strArr.get(strArr.size() - 1) > ch &&
          letterCountsShuffle.get(strArr.get(strArr.size() - 1)) > 0
        ) {
          Character removed = strArr.remove(strArr.size() - 1);
          letterCountsShuffle.put(removed, letterCountsShuffle.get(removed) - 1);
          letterCounts.put(removed, letterCounts.get(removed) + 1);
        }
        strArr.add(ch);
        letterCounts.put(ch, letterCounts.get(ch) - 1);
      } else {
        letterCountsShuffle.put(ch, letterCountsShuffle.get(ch) - 1);
      }
    }

    return convertCharacterListToString(strArr);
  }
}
