package lecture01;
import java.util.Scanner;


public class secondLargest {
  static int secondMax(int[] arr){
  // if array contains only one element
  if (arr.length<2) return -1;
  // traverse the array
  int max=0, scondmax=Integer.MIN_VALUE;
    for (int i:arr){
      if (i>max){
        scondmax = max;
        max = i;
      }
    }
    return scondmax;
  }
  static void main() {
    System.out.println("====================== Find second largest ======================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int secondMax = secondMax(arr);
    System.out.println("The second Largest Element in the array is "+secondMax);
  }
}
