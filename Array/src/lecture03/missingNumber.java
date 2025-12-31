/*
  * GFG Question link --> https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
  * LeetCode Question --> https://leetcode.com/problems/missing-number/description/
*/

package lecture03;

import java.util.Scanner;

public class missingNumber {
  static int missingNumberOptimal(int[] arr) {
    // i will traverse from 0 to n-1 to calculate the actual sum
    int actualSum = 0;
    for (int i : arr) {
      actualSum += i;
    }
    int n = arr.length;
    long expectedSum = (long) n * (n + 1) / 2;
    return (int) (expectedSum - actualSum);
  }

  static int missingNumberXOR(int[] arr) {
    int xor = 0;
    // XOR all numbers from 0 to n
    for (int i = 0; i <= arr.length; i++) {
      xor ^= i;
    }
    for (int i : arr) {
      xor ^= i;
    }
    return xor;
  }

  static void main() {
    System.out.println("=================================== Missing Number ===================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int result = missingNumberOptimal(arr);
    int xor = missingNumberXOR(arr);
    System.out.println("The missing number is " + result);
    System.out.println("The missing number is " + xor);
    sc.close();
  }
}
