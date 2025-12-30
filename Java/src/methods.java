public class methods {

  static int add(int a,int b){
    return a+b;
  }

  static void print(){
    System.out.println("👋 welcome, to Java");
  }
  static void main() {
    System.out.println("------------------------- Methods -------------------------");
    // 0️⃣0️⃣ What is Method ?
    // Method is a block of code which run when it is called
    /*
      * static data-type (parameter){
          * // code
          * return
      * }
    */
    System.out.println(add(10,5));
    System.out.println(add(1,7));
    print();
  }
}
