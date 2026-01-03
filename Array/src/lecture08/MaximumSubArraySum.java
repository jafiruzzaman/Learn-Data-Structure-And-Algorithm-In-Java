/*
  * leetcode link --> https://leetcode.com/problems/maximum-subarray/description/
*/

package lecture08;

import java.util.Scanner;

public class MaximumSubArraySum {
  static int maximumSubArraySumBrute(int[] nums) {
    int len = nums.length;
    int maximum = Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int sum = 0;
        for (int k = i; k < j; k++) {
          sum += nums[k];
        }
        maximum = Math.max(maximum, sum);
      }
    }
    return maximum;
  } // Time-Complexity : O(n^3)

  static int maximumSubArraySumBetter(int[] nums) {
    int len = nums.length;
    int maximum = Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
      int sum = 0;
      for (int j = i; j < len; j++) {
        sum += nums[j];
        maximum = Math.max(maximum, sum);
      }
    }
    return maximum;
  } // Time-Complexity : O(n^2)

  static int maximumSubArraySumOptimal(int[] nums) {
    int maximum = Integer.MIN_VALUE, sum = 0;
    for (int num : nums) {
      sum += num;
      maximum = Math.max(maximum, sum);
      if (sum < 0)
        sum = 0;
    }
    return maximum;
  } // Time-Complexity : O(n)

  static void main() {
    System.out.println(
        "================================================= Maximum Sub-array sum problem =================================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int bruteResult = maximumSubArraySumBrute(arr);
    int betterResult = maximumSubArraySumBetter(arr);
    int optimal = maximumSubArraySumOptimal(arr);
    System.out.println("The Brute result is " + bruteResult);
    System.out.println("The Better result is " + betterResult);
    System.out.println("The optimal result is " + optimal);
    sc.close();
  }
}
