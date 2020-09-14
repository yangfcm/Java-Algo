package design.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {
  public static void main(String[] args) throws IOException {
    String expStr = getExpStr();
    HashMap<String, Integer> var = getValue(expStr);
    Calculator calculator = new Calculator(expStr);
    System.out.println("The calculation result is: " + expStr + "=" + calculator.run(var));
  }

  // Read the expression from user input.
  public static String getExpStr() throws IOException {
    System.out.print("Please input your expression: ");
    return (new BufferedReader(new InputStreamReader(System.in))).readLine();
  }

  public static HashMap<String, Integer> getValue(String expStr) throws IOException {
    HashMap<String, Integer> map = new HashMap<>();
    for (char ch : expStr.toCharArray()) {
      if (ch != '+' && ch != '-') {
        if (!map.containsKey(String.valueOf(ch))) {
          System.out.print("Please input the value for \"" + String.valueOf(ch) + "\" ");
          String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
          map.put(String.valueOf(ch), Integer.valueOf(in));
        }
      }
    }
    return map;
  }
}
