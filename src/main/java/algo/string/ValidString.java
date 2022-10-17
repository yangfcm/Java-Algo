package algo.string;
 
import java.util.*;

/**
 * @name ValidString
 * @description A string is considered to be valid if all characters of the string appear the same number of times.
 * It is also valid if you can remove just 1 character at one index in the string and the remaining characters will occur the same number of times.
 * Given a string s, determine if it is valid as per the above rule.
 * @example s = abc -> valid. characters all appear once.
 * s = abcc -> valid. Just remove 'c' and the remaining characters all appear once.
 * s = abccc -> invalid.
 * @source https://www.hackerrank.com/challenges/sherlock-and-valid-string/
 */
public class ValidString {
  
  /**
   * @param s The given string to test
   * @return True if s is a valid string, false otherwise.
   * @solution Iterate through the string and count each character. Use an object to store the counts for each character in the string.
   * Sort the count as an array and if the string is valid, the array should have one of characteristics below:
   * 1. All numbers are the same i.e. the last number equals to the first number.
   * 2. Only the first number is 1 and the rest numbers are the same.
   * 3. The first number is more than 1 and the last number is just bigger than the second last number by 1, and the second last number equals to the first number.
   */
  public static boolean solution(String s) {
    var charMap = new HashMap<Character, Integer>();
    for(char ch: s.toCharArray()) {
      charMap.put(ch, charMap.get(ch) == null ? 1 : charMap.get(ch) + 1 );
    }
    var countValues = charMap.values().toArray();
    Arrays.sort(countValues);

    if(countValues.length == 1) return true;

    var first = (int) countValues[0];
    var second = (int) countValues[1];
    var last = (int) countValues[countValues.length - 1];
    var secondLast = (int) countValues[countValues.length - 2] ;
    if(first == last) return true;
    if(first == 1 && second == last) return true;
    if(first != 1 && last - secondLast == 1 && secondLast == first) return true;

    return false;
  }
}
