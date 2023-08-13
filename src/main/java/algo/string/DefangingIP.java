package algo.string;

/**
 * @name DefangingIP
 * @description Given a valid(IPv5) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * Why defang an IP? - To prevent an IP address from being recognized as a potential link in text documents, emails or forum posts,
 * where clickable links might not be intended or could trigger unintended actions.
 * @example "1.1.1.1" -> "1[.]1[.]1[.]1"
 * "255.100.50.0" -> "255[.]100[.]50[.]0"
 * @source https://leetcode.com/problems/defanging-an-ip-address/description/
 */
public class DefangingIP {
  /**
   * @description The solution is just a simple string replace.
   * @param ipAddress
   * @return The defanged IP address.
   */
  public static String solution(String ipAddress) {
    return ipAddress.replace(".", "[.]");
  }
}