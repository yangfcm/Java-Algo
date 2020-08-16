package algo.mathematics;

/**
 * Given a number N, print the numbers from 1 to N. But for multiples of 3 print
 * 'fizz' instead of the number, for multiples of 5, print 'buzz', for numbers
 * which are multiples of both 3 and 5, print 'fizzbuzz' For example:
 * fizzbuzz(5); 1 2 fizz 4 buzz
 */
public class Fizzbuzz {
  public static void run(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        System.out.print("fizzbuzz\n");
      } else if (i % 3 == 0) {
        System.out.print("fizz\n");
      } else if (i % 5 == 0) {
        System.out.print("buzz\n");
      } else {
        System.out.print(i + "\n");
      }
    }
  }
}