package lecture01;

import java.util.Scanner;

public class removeDuplicates {

  static int removeDuplicates(int[] arr) {
    if (arr.length == 0)
      return 0; // handle empty array

    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[i] != arr[j]) { // unique element
        i++;
        arr[i] = arr[j];
      }
    }
    return i + 1; // number of unique elements
  }

  static void main() {
    System.out.println("====================== Remove Duplicates From Sorted Array ======================");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("Enter the Elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int uniqueElements = removeDuplicates(arr);

    System.out.println("Number of unique elements: " + uniqueElements);
    System.out.print("Unique elements: ");
    for (int k = 0; k < uniqueElements; k++) {
      System.out.print(arr[k] + " ");
    }
    System.out.println();

    sc.close();
  }
}
