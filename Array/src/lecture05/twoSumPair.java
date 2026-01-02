/*
  Leetcode link --> https://leetcode.com/problems/two-sum/description/
*/

package lecture05;

import java.util.HashMap;
import java.util.Scanner;

public class twoSumPair {
  static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(nums[i], i);
    }
    return new int[] { -1, -1 };
  }

  static void print(int[] nums) {
    for (int item : nums) {
      System.out.print(item + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("=================================== Two Sum Problem ===================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target value");
    int target = sc.nextInt();
    int[] result = twoSum(arr, target);
    print(result);
    sc.close();
  }
}
