/*
  * leetcode question link --> https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
*/

package lecture09;

import java.util.Scanner;

public class RearrangeArrayElements {
  /*
   * Intuition of brute
   * 1. i will create two array one for positive and one for negative
   * 2. i will put back the array elements one from positive and one from negative
   * 3. return the result array
   */
  static int[] RearrangeBrute(int[] nums) {
    int len = nums.length;
    int[] positive = new int[len / 2];
    int[] negative = new int[len / 2];
    int p = 0, n = 0;
    for (var num : nums) {
      if (num < 0) {
        negative[n++] = num;
      } else {
        positive[p++] = num;
      }
    }
    // put-back the array elements
    for (int i = 0; i < len / 2; i++) { // loop will run from 0 to len/2 times
      nums[2 * i] = positive[i];
      nums[2 * i + 1] = negative[i];
    }
    return nums;
  }

  static int[] RearrangeOptimal(int[] nums) {
    int len = nums.length;
    int[] ans = new int[len];
    int positive = 0, negative = 1;
    for (var i : nums) {
      if (i > 0) {
        ans[positive] = i;
        positive += 2;
      } else {
        ans[negative] = i;
        negative += 2;
      }
    }
    return ans;
  }

  static void print(int[] nums) {
    for (var item : nums) {
      System.out.print(item + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println(
        "====================================== Rearrange Array Elements By Sign ======================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int[] result = RearrangeOptimal(arr);
    print(result);
    sc.close();
  }
}
