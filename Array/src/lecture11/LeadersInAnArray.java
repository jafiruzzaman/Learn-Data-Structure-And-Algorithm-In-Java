/*
  * GFG Question link --> https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
*/

package lecture11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersInAnArray {

  static List<Integer> leaders(int[] arr) {
    List<Integer> leaders = new ArrayList<>();
    int n = arr.length;
    int maxFromRight = arr[n - 1];
    leaders.add(maxFromRight); // last element is always a leader

    // traverse from second last element to the start
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > maxFromRight) {
        leaders.add(arr[i]);
        maxFromRight = arr[i];
      }
    }

    // reverse the list to maintain order
    Collections.reverse(leaders);
    return leaders;
  }

  public static void main(String[] args) {
    System.out.println("=================================================== Leaders In An Array Problem ===================================================");
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    List<Integer> result = leaders(arr);
    System.out.println("Leaders in the array: " + result);

    sc.close();
  }
}
