public class loop {
  static void main() {
    System.out.println("-------------------------- loops In Java --------------------------");
    // 0️⃣0️⃣ What is Loop ?
    // Ans: Loop is used for reduce same task for N numbers
    // 0️⃣1️⃣ For Loop
    /*
      * Syntax of For Loop
      * for(initialization,condition,updation){
      *     // code
      * }
    */
    System.out.println("-------------------------- Print Using for Loop --------------------------");

    for (int i = 0;i<5;i++){
      System.out.print(i+" ");
    }

    System.out.println();
    // 0️⃣2️⃣ While Loop
    System.out.println("-------------------------- Print Using while Loop --------------------------");
    int i = 0;
    while (i<5){
      System.out.print(i+" ");
      i++; // ⚠️ If don't update loop will be infinite
    }
    System.out.println();
    // 0️⃣3️⃣ Do-While Loop
    System.out.println("-------------------------- Print Using Do While Loop --------------------------");
    i = 6;
    do{
      System.out.print(i);
      i++;
    }while (i<4);
    System.out.println();
    System.out.println("Do while loop run at-least one time if condition become false");
  }
}
