// leetcode question link --> https://leetcode.com/problems/single-number/description/

package lecture03;

import java.util.Scanner;

public class appearsOne {
  static int findAppearsOne(int[] arr) {
    int xor = 0;
    for (int item : arr) {
      xor ^= item;
    }
    return xor;
  }

  public static void main(String[] args) {
    System.out.println("=========================== Find Number that Appears Ones ===========================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int findAppears = findAppearsOne(arr);
    System.out.println("The single element in this array is " + findAppears);
    sc.close();
  }
}
