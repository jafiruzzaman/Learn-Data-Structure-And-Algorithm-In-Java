/*
  * leetcode question link --> https://leetcode.com/problems/sort-colors/description/
*/
package lecture06;

import java.util.Scanner;

public class sortColors {
  static void sortColors(int[] nums) {
    // keep 3 pointers low,mid high
    int low = 0, mid = 0, high = nums.length - 1;
    while (mid <= high) {
      switch (nums[mid]) {
        case 0 -> {
          swap(nums, low, mid);
          low++;
          mid++;
        }
        case 1 -> mid++;
        default -> {
          swap(nums, mid, high);
          high--;
        }
      }
    }
  }

  static void swap(int[] nums, int start, int end) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
  }

  static void print(int[] nums) {
    for (int item : nums) {
      System.out.print(item + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println(
        "======================================================== Sort Colors ========================================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    sortColors(arr);
    print(arr);
    sc.close();
  }
}
