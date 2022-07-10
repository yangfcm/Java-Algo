package algo.sorting;

import java.util.Arrays;

/**
 * @name FradulentActivityNotice
 * @description Assume a bank has a simple policy for warning clients about possible fradulate account activity.
 * If the amount spent by a client on a particular day is greater than or equal to the client's median spending for a trailing number of days,
 * they send the client a notification about potential fraud.
 * The bank doesn't send the client any notifications until they have at least that trailing number of prior days' transaction data.
 * Given the number of trailing days *d* and a client's total daily expenditures for a period of *n* days,
 * determine the number of times the client will receive a notification over all *n* days.
 * @example expenditure = [10, 20, 30, 40, 50] d = 3, fradulentActivityNotice(expenditure, d) -> 1.
 * As d = 3, on the first 3 days, it just collects data. On day 4, trailing 3 days expenditures are [10, 20, 30].
 * The median is 20 and D4's expenditure is 40. Because 40 >= 20 * 2, client will get a notification.
 * Then on day 5, trailing 3 days expenditures are [20, 30, 40]. The median is 30 and D5's expenditure is 50.
 * Because 50 < 30 * 2, client will not get a notification on that day.
 * So, there will be 1 notification sent.
 */ 
public class FradulentActivityNotice {

  /**
   * @param expenditure An array that represents N consecutive days of spending amount.
   * @param d From which day, notification is started.
   * @return The count of notifications triggered.
   * @solution Use the idea of counting sort.
   * Since you need to find out the median number in trailing n days, imagine there's a time window with width of d sliding along the array.
   * Use the example: expenditure = [10, 20, 30, 40, 50] d = 3.
   * |10, 20, 30|, 40, 50
   * 10, |20, 30, 40|, 50
   * 10, 20, |30, 40, 50|
   * You need to find out the median number in this time window.
   * You don't need to really sort it and then get median number as it is time-consuming.
   * Just use the idea of counting sort to find out the number in the middle position.
   */
  public static int solution(int[] expenditure, int d) {
    int notificationCount = 0;
    int max = expenditure[0];
    for (int i : expenditure) {
      if(i > max) max = i;
    }
    int[] countArr = new int[max + 1];
    Arrays.fill(countArr, 0); // Initialize count array.

    for(int i = 0; i < d; i++ ) {
      // Fill a partial count array from the first day to the d-th day.
      countArr[expenditure[i]]++;
    }

    // With the time moving on, you just need to care about the expenditure in previous d days.
    for(int i = d; i < expenditure.length; i++) {
      int median = getMedian(d, countArr);
      if(expenditure[i] >= median) notificationCount++;

      // Update count array
      countArr[expenditure[i-d]]--;
      countArr[expenditure[i]]++;
    }

    return notificationCount;
  }

  /**
   * @name getMedian
   * @param d The number of counted elements.
   * @param count A partial count arrays. How many elements are counted is decided by parameter d.
   * @return The median number in the sorted array.
   */
  private static int getMedian(int d, int[] count) {
    int median = 0;
    int[] countArr = count.clone();
    for(int i = 1; i < countArr.length; i++) {
      countArr[i] += countArr[i-1];
    }

    if(d % 2 == 0) {
      int m1 = d / 2;
      int m2 = d / 2 + 1;
      for(int i = 0; i < countArr.length; i++) {
        if(m1 <= countArr[i]) {
          median += i;
          break;
        }
      }
      for(int i = 0; i < countArr.length; i++) {
        if(m2 <= countArr[i]) {
          median += i;
          break;
        }
      }
    } else {
      int m = (d + 1) / 2;
      for(int i = 0; i < countArr.length; i++) {
        if(m <= countArr[i]) {
          median = i * 2;
          break;
        }
      }
    }

    return median;
  }
}