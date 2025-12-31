/*
  Question link --> https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
*/
package lecture02;

import java.util.Scanner;

public class leftRotateByOnePlaces {
  static void leftRotateByOne(int[] arr) {
    if (arr.length == 0)
      return;
    int lastElement = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = lastElement;
  }

  static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void main() {
    System.out.println("=================== Left Rotate By One ===================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    leftRotateByOne(arr);
    print(arr);
    sc.close();
  }
}
