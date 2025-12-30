/*
  * Question link --> https://leetcode.com/problems/rotate-array/description/
*/
package lecture02;

import java.util.Scanner;

public class rightRotateByDPlaces {
  static void reverse(int[] arr,int start,int end){
    while (start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  static void rightRotateByD(int[] arr,int d){
    int len = arr.length;
    if (len<=1) return;
    d = d % len;
    reverse(arr,0,len-d-1);
    reverse(arr,len-d,len-1);
    reverse(arr,0,len-1);
  }
  static void print(int[] arr){
    for (int i: arr){
      System.out.print(i+" ");
    }
  }
  static void main() {
    System.out.println("============================= Right Rotate An Array By D Places =============================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("How many you want to rotate");

    int d = sc.nextInt();
    rightRotateByD(arr,d);
    print(arr);

    sc.close();
  }
}
