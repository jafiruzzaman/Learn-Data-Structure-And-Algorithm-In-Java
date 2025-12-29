import java.util.Scanner;

public class inputAndOutput {
  static void main() {
    System.out.println("--------------------- Input And Output ---------------------");
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------- Input And Output For Byte ---------------------");
//  1️⃣ bytes
    byte byteValue = sc.nextByte();
    System.out.println("Byte Value "+byteValue);
//  2️⃣ short
    System.out.println("--------------------- Input And Output For Short ---------------------");
    short shortValue = sc.nextShort();
    System.out.println("short Value "+shortValue);
//  3️⃣ int
    System.out.println("--------------------- Input And Output For Int ---------------------");
    int intValue = sc.nextInt();
    System.out.println("int value "+intValue);
//  4️⃣ long
    System.out.println("--------------------- Input And Output For long ---------------------");
    long longValue = sc.nextLong();
    System.out.println("long value "+longValue);
//  5️⃣ boolean
    System.out.println("--------------------- Input And Output For boolean ---------------------");
    boolean booleanValue = sc.nextBoolean();
    System.out.println("boolean value "+booleanValue);
//  6️⃣ float
    System.out.println("--------------------- Input And Output For Float ---------------------");
    float floatingValue = sc.nextFloat();
    System.out.println("float value "+floatingValue);
//  7️⃣ double
    System.out.println("--------------------- Input And Output For Double ---------------------");
    double doubleValue = sc.nextDouble();
    System.out.println("double value "+doubleValue);
//  8️⃣ char
    System.out.println("--------------------- Input And Output For char ---------------------");
    char charValue = sc.next().charAt(0);
    System.out.println("char value "+charValue);
//  ⚠️ make sure to close it
    sc.close();
  }
}
