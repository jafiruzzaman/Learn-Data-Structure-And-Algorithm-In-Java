/*
  Question link --> https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
*/
package lecture02;
import java.util.Scanner;

public class leftRotateByDPlaces {
  static void reverse(int[] arr,int start,int end){
    while (start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  static void leftRotateByD(int[] arr,int d){
    int len = arr.length;
    if (len<=1) return;
    d = d % len;
    // reverse from 0 to d-1
    reverse(arr,0,d-1);
    reverse(arr, d,len-1);
    reverse(arr,0,len-1);
  }
  static void print(int[] arr){
    for (int i: arr){
      System.out.print(i+" ");
    }
  }
  static void main() {
    System.out.println("================================= Left Rotate an Array By D Places " +
        "=================================");
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
    leftRotateByD(arr,d);
    print(arr);
    sc.close();
  }
}
