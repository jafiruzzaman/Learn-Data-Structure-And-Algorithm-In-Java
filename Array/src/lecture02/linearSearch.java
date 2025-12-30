/*
  Question link --> https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
*/

package lecture02;
import java.util.Scanner;

public class linearSearch {
  static int linearSearch(int[] arr,int x){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==x) return i;
    }
    return -1;
  }
  static void main() {
    System.out.println("================================ linear search ================================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the elemnt what you want to find");
    int x = sc.nextInt();
    int result = linearSearch(arr,x);
    System.out.println("The element is present at "+result);
    sc.close();
  }
}
