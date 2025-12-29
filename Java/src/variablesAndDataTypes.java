public class variablesAndDataTypes {
  static void main() {
    System.out.println("variables and data-types in Java");
    // 0️⃣0️⃣ What is Variable ?
    // Ans: Variable is a container to store values.For example if you want to store milk you have to store it into a milk bottle 🍼

    // 0️⃣1️⃣ How to Create a variable
    int variable = 10; // variable store 10

    // 0️⃣3️⃣ Data-Types
    /*
     * 1️⃣ byte
     * 2️⃣ short
     * 3️⃣ int
     * 4️⃣ long
     * 5️⃣ char
     * 6️⃣ boolean
     * 7️⃣ float
     * 8️⃣ double
     */

    System.out.println("---------------------- Integer Data-type ----------------------");
  //   1️⃣ byte
    byte byteValue = 127;
    System.out.println("byte value is "+byteValue);
  //   2️⃣ short
    short shortValue = 3357;
    System.out.println("short value is "+shortValue);
  //   3️⃣ int
    int intValue = 32765;
    System.out.println("Int Value is "+intValue);
  //  4️⃣ long
    long longValue = 232346546545L; // make sure add L at the last after digit
    System.out.println("Long value is"+longValue);
    System.out.println("---------------------- Char Data-type ----------------------");
  //  5️⃣ char
    char c = 'c';
    System.out.println("Character value is "+c); // char add single

    System.out.println("---------------------- Boolean Data-type ----------------------");
  //  6️⃣ boolean
      boolean isCoder = false;
      System.out.println("is I am a coder "+isCoder);

    System.out.println("---------------------- Fractional Data-type ----------------------");
  //  7️⃣ float
      float floatingValue = 127.456f;
      System.out.println("float of the value is "+floatingValue); // 7 precision value after .

  //  8️⃣ double
      double doubleValue = 127.521654654d;
      System.out.println("double value is "+doubleValue); // 15 precision value after .
  }
}
