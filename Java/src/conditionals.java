import java.util.Scanner;

public class conditionals {
  static void main() {
    System.out.println("Conditionals in Java");
//  0️⃣0️⃣ What is conditionals ?
//  Ans: Conditionals are used to make decisions in a program.
    int age;
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
//  0️⃣1️⃣ if statement
    if (age>=18) System.out.println("You are an adult");
//  0️⃣2️⃣ if-else statement
    if (age>0 && age<=17){
      System.out.println("You are a teen age");
    }else {
      System.out.println("You are an Adult");
    }
//  0️⃣3️⃣ if else-if else statement
    if (age>0 && age<=17){
      System.out.println("You are a teen age");
    }else if(age>=18 && age<=120){
      System.out.println("You are an Adult");
    }else{
      System.out.println("Your age is out of program");
    }
//  0️⃣4️⃣ switch-case statement
    System.out.println("Enter a day number of the week");
    int day = sc.nextInt();
    switch (day){
      case 1:
        System.out.println("The day is Saturday");
        break;
      case 2:
        System.out.println("The day is Sunday");
        break;
      case 3:
        System.out.println("The Day is Monday");
        break;
      case 4:
        System.out.println("The Day is Tuesday");
        break;
      case 5:
        System.out.println("The Day is Wednesday");
        break;
      case 6:
        System.out.println("The Day is Thursday");
        break;
      case 7:
        System.out.println("The Day is Friday");
        break;

    }
//  ⚠️ make sure that close the scanner
    sc.close();
  }
}
