package polymorphism;

public class Main {
  static void main() {
    System.out.println("================================================== Polymorphism  ==================================================");
    // Polymorphism means:
    //
    //“Many forms” – the ability of a method, object, or function to behave differently in different situations.
    // in short form -->  different name, different behaviors
    System.out.println("================================================== Compile Polymorphism  ==================================================");
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(5,7));
    System.out.println(calculator.add(5.52,7.87));
    System.out.println("================================================== Runtime Polymorphism  ==================================================");
    Dog dog = new Dog();
    dog.sound();
  }
}

// There are 2 types of polymorphism

// 1. compile time polymorphism
class Calculator{
  int add(int a,int b){
    return a+b;
  }
  double add(double a, double b){
    return a+b;
  }
}
// 2. runtime polymorphism
class Animal {
  void sound(){
    System.out.println("Animal make sound");
  }
}
class Dog extends Animal{
  @Override
  void sound(){
    System.out.println("wolf sound");
  }
}
