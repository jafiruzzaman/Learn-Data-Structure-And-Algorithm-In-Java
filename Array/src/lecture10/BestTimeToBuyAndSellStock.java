/*
  * leetcode question link --> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
*/

package lecture10;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
  static int solution(int[] nums){
    int minPrice = Integer.MAX_VALUE;
    int maxProfit=0;
    for (int num:nums){
      if (num<minPrice) minPrice = num;
      else if(num-minPrice>maxProfit) maxProfit = num-minPrice;
    }
    return maxProfit;
  }
  static void main() {
    System.out.println("=============================================== Best time to buy and sell stocks ===============================================");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the Elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int maxProfit = solution(arr);
    System.out.println("The maximum profit is "+maxProfit);
    sc.close();
  }
}
