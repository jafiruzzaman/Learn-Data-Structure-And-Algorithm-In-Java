/*
  Question link --> https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
*/

package lecture01;

import java.util.Scanner;

public class isSortedArray {
  static boolean isSorted(int[] arr) {
    // length of the array
    int len = arr.length;
    for (int i = 1; i < len; i++) {
      if (arr[i] < arr[i - 1]) { // ✅ check unsorted pair
        return false;
      }
    }
    return true;
  }

  static void main() {
    System.out.println("====================== Check Array is Sorted ======================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    boolean result = isSorted(arr);
    System.out.println("is the array is sorted : " + result);
    sc.close();
  }
}
