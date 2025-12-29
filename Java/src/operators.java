public class operators {
  static void main() {
    System.out.println("---------------- Operators In Java ----------------");
    // What is Operators
    // Ans:
    // Types of Operator
    /*
      * 0️⃣1️⃣ Assignment Operator
      * 0️⃣2️⃣ Arithmetic Operator
      * 0️⃣3️⃣ Comparison Operator
      * 0️⃣4️⃣ Logical Operator
      * 0️⃣5️⃣ Bitwise Operator
    */

    // ---------------- 0️⃣1️⃣ Assignment Operators ----------------
    System.out.println("\n--- Assignment Operators ---");
    int a = 10;      // simple assignment
    int b = 5;
    System.out.println("a = " + a + ", b = " + b);
    a += 5;          // a = a + 5
    System.out.println("a += 5 → a = " + a);
    b *= 2;          // b = b * 2
    System.out.println("b *= 2 → b = " + b);

    // ---------------- 0️⃣2️⃣ Arithmetic Operators ----------------
    System.out.println("\n--- Arithmetic Operators ---");
    int sum = a + b;
    int diff = a - b;
    int prod = a * b;
    int div = a / b;
    int mod = a % b;
    System.out.println("sum = " + sum);
    System.out.println("diff = " + diff);
    System.out.println("prod = " + prod);
    System.out.println("div = " + div);
    System.out.println("mod = " + mod);

    // ----------------0️⃣3️⃣ Comparison Operators ----------------
    System.out.println("\n--- Comparison Operators ---");
    System.out.println("a == b → " + (a == b));
    System.out.println("a != b → " + (a != b));
    System.out.println("a > b → " + (a > b));
    System.out.println("a < b → " + (a < b));
    System.out.println("a >= b → " + (a >= b));
    System.out.println("a <= b → " + (a <= b));

    // ----------------0️⃣4️⃣ Logical Operators ----------------
    System.out.println("\n--- Logical Operators ---");
    boolean x = true;
    boolean y = false;
    System.out.println("x && y → " + (x && y)); // AND
    System.out.println("x || y → " + (x || y)); // OR
    System.out.println("!x → " + (!x));         // NOT

    // ----------------0️⃣5️⃣ Bitwise Operators ----------------
    System.out.println("\n--- Bitwise Operators ---");
    int p = 5;   // 0101 in binary
    int q = 3;   // 0011 in binary
    System.out.println("p & q → " + (p & q));   // AND
    System.out.println("p | q → " + (p | q));   // OR
    System.out.println("p ^ q → " + (p ^ q));   // XOR
    System.out.println("~p → " + (~p));         // NOT
    System.out.println("p << 1 → " + (p << 1)); // left shift
    System.out.println("p >> 1 → " + (p >> 1)); // right shift
  }
}
