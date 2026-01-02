/*
  * leetcode question link --> https://leetcode.com/problems/majority-element/description/
*/

package lecture07;

import java.util.HashMap;
import java.util.Scanner;

public class majorityElements {
  static int majorityElementBrute(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      int count = 0;
      for (int j = 0; j < len; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > len / 2) {
        return nums[i];
      }
    }
    return -1;
  }

  static int majorityElementBetter(int[] nums) {
    int len = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (var num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (var key : map.keySet()) {
      if (map.get(key) > len / 2) {
        return key;
      }
    }
    return -1;
  }

  static int majorityElementOptimal(int[] nums) {
    int count = 0, candidate = 0;
    for (var element : nums) {
      if (count == 0) {
        candidate = element;
      }
      if (candidate == element) {
        count++;
      } else {
        count--;
      }
    }
    return candidate;
  }

  public static void main(String[] args) {
    System.out.println("================================= Majority Elements Problem =================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int result = majorityElementOptimal(arr);
    System.out.println("The majority element in this array is " + result);
    sc.close();
  }
}
