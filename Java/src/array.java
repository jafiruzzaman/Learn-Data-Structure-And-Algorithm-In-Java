public class array {
  static void main() {
    System.out.println("-------------------------- 1D Array and its Methods --------------------------");
//  0️⃣0️⃣ What is an Array ?
//   Array is a collection of similar elements in contiguous location

//  0️⃣1️⃣ Initialization of an array
    int[] initializeArray = new int[5];

//  0️⃣2️⃣ Declare an array
    int[] declareArray = {1,2,3,4,5};

//  0️⃣3️⃣ insert Operation in array
    int[] insertArray = new int[4];
    insertArray[1] = 40;
    insertArray[2] = -7;

//  0️⃣4️⃣ access element in array
    System.out.println(insertArray[1]);

//  0️⃣5️⃣ length property return the length of the array
    System.out.println(insertArray.length);

//  0️⃣6️⃣ iteration of an array
    for (int i =0;i< initializeArray.length;i++){
      System.out.print(initializeArray[i]+" ");
    }
    System.out.println();

//  0️⃣7️⃣ For-each loop for iteration [✋ just read-only]
    for (int value: insertArray){
      System.out.print(value+" ");
    }
    System.out.println();

    System.out.println("-------------------------- 2D Array and its Methods --------------------------");
//  0️⃣8️⃣ What is 2D Array
//  2d Array of arrays just like matrix

//  0️⃣9️⃣ Declare a 2D Array
    int[][] matrix1 = new int[2][3];

//  1️⃣0️⃣ initialization of an array
    int[][] matrix = {
      {
        1,2,3
      },
      {
        4,5,6
      }
    };

//  1️⃣1️⃣ Accessing 2D Array Elements
    System.out.println(matrix[1][2]);

//  1️⃣2️⃣ iteration of 2D Array
    for (int i =0;i<matrix.length;i++){
      for (int j =0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}
