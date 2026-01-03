package oops;

public class LearnClassesAndObject {

  public static void main(String[] args) {
    System.out.println("================================================== Classes And Objects ==================================================");

    // Creating object of Student class
    Student student1 = new Student(1, 20, 12);

    // Accessing object behavior
    student1.displayStudentInfo();
  }
}

/*
 * What is Class?
 * A class is a user-defined blueprint that contains
 * attributes (data) and behaviors (methods).
 */
class Student {
  int id;
  int age;
  int standard;

  // Parameterized Constructor
  Student(int id, int age, int standard) {
    this.id = id;
    this.age = age;
    this.standard = standard;
  }

  // Method (behavior)
  void displayStudentInfo() {
    System.out.println("ID: " + id);
    System.out.println("Age: " + age);
    System.out.println("Standard: " + standard);
  }
}
