/*
  * GFG Link --> https://www.geeksforgeeks.org/problems/key-pair5616/1
*/

package lecture05;

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
  static boolean twoSum(int[] nums, int target) {
    Arrays.sort(nums);
    int i = 0, j = nums.length - 1;
    while (i < j) {
      int sum = nums[i] + nums[j];
      if (sum == target) {
        return true;
      } else if (sum < target) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("====================================== two sum pair ======================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target value: ");
    int target = sc.nextInt();
    boolean result = twoSum(arr, target);
    System.out.println("is target value is present in this array " + result);
    sc.close();
  }
}
