/*
  Question link --> https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
*/
package lecture02;

import java.util.ArrayList;
import java.util.Scanner;

public class unionOfArray {
  static ArrayList<Integer> unionOfTwoSortedArray(int[] arr, int[] brr){
    int i =0, j =0;
    ArrayList<Integer> result = new ArrayList<>();

    while (i<arr.length && j< brr.length){
      int x = arr[i],y = brr[j];
      if (x==y){
        if (result.isEmpty() || result.get(result.size()-1)!=x){
          result.add(x);
        }
        i++;j++;
      }
      else if (x<y){
        if (result.isEmpty() || result.get(result.size()-1)!=x){
          result.add(x);
        }
        i++;
      }
      else {
        if (result.isEmpty() || result.get(result.size()-1)!=y){
          result.add(y);
        }
        j++;
      }
    }
    while (i< arr.length){
      if (result.isEmpty() || result.get(result.size()-1)!=arr[i]){
        result.add(arr[i]);
      }
      i++;
    }
    while (j< brr.length){
      if (result.isEmpty() || result.get(result.size()-1)!=brr[j]){
        result.add(brr[j]);
      }
      j++;
    }
    return result;
  }
  static void print(ArrayList<Integer> arr){
    for (int i: arr){
      System.out.print(i+" ");
    }
  }
  static void main() {
    System.out.println("====================================== Union of 2 " +
        "Sorted Array======================================");
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
    System.out.println("After ");
    ArrayList<Integer> result = unionOfTwoSortedArray(arr,brr);
    print(result);
  }
}
