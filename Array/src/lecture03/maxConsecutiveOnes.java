/*
  * LeetCode Question link --> https://leetcode.com/problems/max-consecutive-ones/description/
  * GFG Question link --> https://www.geeksforgeeks.org/problems/max-consecutive-one/1
*/

package lecture03;

import java.util.Scanner;

public class maxConsecutiveOnes {
  static int maxConsecutiveOne(int[] arr) {
    int max = 0, count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        count++;
        max = Math.max(max, count);
      } else {
        count = 0;
      }
    }
    return max;
  }

  static void main() {
    System.out.println("============================================ Max Consecutive Ones " +
        "============================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int max = maxConsecutiveOne(arr);
    System.out.println("The maximum number of one is " + max);
    sc.close();
  }
}
