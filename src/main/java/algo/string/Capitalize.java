package algo.string;

/**
 * @name Captialize
 * @description Given a string, capitalize the first letter of each word in the string then return the capitalized string.
 * @example capitalize('it is so good!') -> It Is So Good
 */
public class Capitalize {
  /**
   * @param str
   * @return A string that capitalizes the first letter of each word in str
   * @solution Create an empty string.
   * Iterate each character in the string
   * Capitalize the fist letter and add it to 'result'. 
   * If the character to the left is a space, capitalize it and add it to 'result'.
   * Otherwise, add it to 'result' directly
   */
  public static String SolutionOne(String str) {
    String capStr = str.substring(0, 1).toUpperCase();
    for (int i = 1; i < str.length(); i++) {
      String letter = str.substring(i, i + 1);
      String leftLetter = str.substring(i - 1, i);
      if (leftLetter.equals(" ")) { // If the left letter is a space
        capStr += letter.toUpperCase();
      } else {
        capStr += letter;
      }
    }
    return capStr;
  }
  /**
   * @param str
   * @return A string that capitalizes the first letter of each word in str
   * @solution Split the string by spaces to an array. 
   * Iterate the array and uppercase the first letter of each word. 
   * Join the array to a string and return it.
   */
  public static String SolutionTwo(String str) {
    String[] strArr = str.split(" ");
    for (String word : strArr) {
      word = word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    return String.join(" ", strArr);
  }
}