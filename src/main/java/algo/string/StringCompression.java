package algo.string;

/**
 * @name stringCompression
 * @description Implement a function to perform basic string compression using the counts of repeated characters.
 * If the compressed string would not be smaller than the original string, should return original string.
 * Assume the string has only uppercase and lowercase letters a-z.
 * @example aabcccccaaa -> a2b1c5a3
 * aabbccdefg -> aabbccdefg 
 */
public class StringCompression {
  /**
   * @param str
   * @return Compressed version of str or just the original str.
   * @solution Iterate through the string and calculate the compressed string.
   * If the length of compressed string is smaller than original string, return the compressed string. Otherwise, return original string.
   */
  public static String solution(String str) {
    String compressed = "";
    char[] strArr = str.toCharArray();
    char repeatChar = strArr[0];
    int repeatCharCount = 1;
    for (int i = 1; i < strArr.length; i++) {
      char ch = strArr[i];
      if (ch == repeatChar) {
        repeatCharCount++;
      } else {
        compressed += String.valueOf(repeatChar) + String.valueOf(repeatCharCount);
        repeatChar = ch;
        repeatCharCount = 1;
      }
    }
    compressed += String.valueOf(repeatChar) + String.valueOf(repeatCharCount);
    return compressed.length() < str.length() ? compressed : str;
  }
}
