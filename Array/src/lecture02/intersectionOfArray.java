/*
  * LeetCode Question link --> https://leetcode.com/problems/intersection-of-two-arrays/description/
  * GFG Question link --> https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1
*/

package lecture02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class intersectionOfArray {
  // This is Better Solution --> ⚠️ if array is not sorted then
  static ArrayList<Integer> intersectionOfTwoSortedArray(int[] arr, int[] brr) {

    int i = 0, j = 0;
    ArrayList<Integer> result = new ArrayList<>();
    while (i < arr.length && j < brr.length) {
      if (result.isEmpty() || result.getLast() != arr[i]) {
        result.add(arr[i]);
        i++;
        j++;
      } else if (arr[i] < brr[j]) {
        i++;
      } else {
        j++;
      }
    }
    return result;
  }

  static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> result = new HashSet<>();

    // add all the elements of nums1
    for (int num : nums1) {
      set.add(num);
    }
    // check num2
    for (int num : nums2) {
      if (set.contains(num)) {
        result.add(num);
      }
    }
    // convert to int[] array
    int[] ans = new int[result.size()];
    int i = 0;
    for (int num : result) {
      ans[i++] = num;
    }
    return ans;
  }

  static void printArrayList(ArrayList<Integer> arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  static void main() {
    System.out.println("================================== intersection of 2 sorted array " +
        "==================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the size of the brr ");
    int brrSize = sc.nextInt();
    int[] brr = new int[brrSize];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < brrSize; i++) {
      brr[i] = sc.nextInt();
    }
    ArrayList<Integer> result = intersectionOfTwoSortedArray(arr, brr);
    int[] resultArray = intersection(arr, brr);
    printArrayList(result);
    printArray(resultArray);
    sc.close();
  }
}
