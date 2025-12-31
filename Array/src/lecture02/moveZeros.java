/*
  Question link --> https://leetcode.com/problems/move-zeroes/description/
*/

package lecture02;

import java.util.Scanner;

public class moveZeros {
  static void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }

  static void moveZerosToTheEnd(int[] arr) {
    // find the first zero in the array
    int firstZero = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        firstZero = i;
        break;
      }
    }
    for (int j = firstZero + 1; j < arr.length; j++) {
      if (arr[j] != 0) {
        swap(arr, j, firstZero);
        firstZero++;
      }
    }
  }

  static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void main() {
    System.out.println("============================ Move Zeros To end ============================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    moveZerosToTheEnd(arr);
    print(arr);
  }
}
