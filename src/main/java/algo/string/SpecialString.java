package algo.string;

/**
 * @name SpecialString
 * @description A string is considered to be special if either of the two conditions is met:
 * 1. All the characters are the same, like 'aaa'
 * 2. All the characters except the middle one are the same, like 'aadaa'.
 * Given a string s, determine how many special substrins can be formed from it.
 * @example s = mnonopoo -> 12. It has 12 special substrings, they are: 'm', 'n', 'o', 'n', 'o', 'p', 'o', 'o', 'non', 'ono', 'opo', 'oo'
 * @source https://www.hackerrank.com/challenges/special-palindrome-again
 */
public class SpecialString {
  
  /**
   * @param s
   * @return The number of special strings.
   * @solution Consider different scenarios:
   * 1. Each character is a special substring, so count them first. It's just the length of the string.
   * 2. Count all substrings that have exact same characters.
   * 3. Count all substrings that have one different letter in the middle and same rest letters on its both sides.
  */
  public static int solution(String s) {
    char[] str = s.toCharArray();
    int count = str.length; // 1. Each single character is a special substring, so our count starts from here.
    
    for(int i = 0; i < str.length; i++) {
      // 2. Count all substrings that have exact same characters.
      for(int j = i+1; j < str.length; j++) {
        if(str[j] == str[i]) count++;
        else break;
      }
    }

    for(int i = 1; i < str.length-1; i++) {
      // 3. Count substrings that have one different letter in the middle and same rest letters on its both sides
      // The algorithm is for each character, except the first and last one, it should have the same letters on its left side and right side. 
      char ch = str[i]; // Current character
      int offset = 1;
      char next = str[i+offset];

      while(i - offset >= 0 && i + offset < str.length) { // Starting from the current character, look at its left and right characters.
        if(str[i-offset] == str[i+offset] && next == str[i+offset] && next != ch) {
          count++;
        } else {
          break;
        }
        
        offset++;
      } 
    }

    return count;
  }
}
