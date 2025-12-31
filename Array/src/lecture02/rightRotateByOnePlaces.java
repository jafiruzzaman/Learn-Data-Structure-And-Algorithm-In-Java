/*
  * Question link --> https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
*/
package lecture02;

import java.util.Scanner;

public class rightRotateByOnePlaces {
  static void rightRotate(int[] arr) {
    int len = arr.length;
    if (len == 0)
      return;
    int lastElement = arr[len - 1];
    for (int i = len - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = lastElement;
  }

  static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void main() {
    System.out.println("=================== Right Rotate By One ===================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    rightRotate(arr);
    print(arr);
    sc.close();
  }
}
