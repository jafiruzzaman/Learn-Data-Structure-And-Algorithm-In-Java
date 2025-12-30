package lecture01;

import java.util.Scanner;

public class largestElement {
  static int findLargest(int[] arr){
    // 0️⃣ length of the array
    int len = arr.length;
    int max = 0;
    for (int i=0;i<len;i++){
      if (arr[i]>max){
        max= arr[i];
      }
    }
    if (max==0) return arr[0];
    return max;
  }
  static void main() {
    System.out.println("====================== largest element in an array ======================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int max = findLargest(arr);
    System.out.println("The maximum element of the array is "+max);
    sc.close();
  }
}
