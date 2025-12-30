public class strings {
  static void main() {
    System.out.println("-------------------------- String and its Methods --------------------------");
//  0️⃣0️⃣ What is String ?
//  String is a collection of characters.

//  📝 Char[] are mutable but string is immutable
    char[] chars = {'j','a','v','a'};
    for (char c:chars){
      System.out.print(c);
    }
    System.out.println();

//  0️⃣2️⃣ how to create a string
    String str = "Java";

//  0️⃣3️⃣ length of the string
    System.out.println("Length of the string "+str.length());

//  0️⃣4️⃣ find character at specific index
    System.out.println("J in Java at "+str.charAt(0));

//  0️⃣5️⃣ substring create return a substring from specific index to a specific index-1
    System.out.println(str.substring(0,2));

//  0️⃣6️⃣ equals method helps to compare with 2 string ⚠️ Never use == double equals
    String a = "Java";
    String b = "jaVa";
    System.out.println(a.equals(b));

//  0️⃣7️⃣ iteration in an array
    for (int i =0;i<str.length();i++){
      System.out.print(str.charAt(i)+" ");
    }
    System.out.println();
//  0️⃣8️⃣ compareTo() compare string lexicographically
    String apple = "apple";
    String banana = "banana";
    System.out.println(apple.compareTo(banana)); /* ⚠️ if ans == 0  then equals,if<0 then a comes before b if ans > 0
 then a comes after b */

//  0️⃣9️⃣ case Conversion
    String java = "Java";
    System.out.println(java.toLowerCase());
    System.out.println(java.toUpperCase());

//  1️⃣0️⃣ indexOf() --> return first next & lastIndexOf() --> return the last index
    String programming = "programming";
    System.out.println(programming.indexOf('g'));
    System.out.println(programming.lastIndexOf('g'));

//  1️⃣1️⃣ contains() --> check substring exist or not
    System.out.println(programming.contains("gram"));

//  1️⃣2️⃣ trim() --> Remove spaces from start & end
    String programming1 = "               java           ";
    System.out.println("before Trim: "+programming1);
    System.out.println(programming1.trim());
//  1️⃣3️⃣ String Immutability
    String s = "Java";
    s.concat(" DSA"); // ❌ Can't Possible because String are immutable in java
    // Rather than assign in the same string
    s = s.concat(" DSA");
    System.out.println(s);

//   1️⃣4️⃣ String Builder In Java
    StringBuilder sb = new StringBuilder("DSA ");
//   1️⃣4️⃣.0️⃣ Append
    sb.append("In Java");
    System.out.println(sb);

//   1️⃣4️⃣.1️⃣insert --> insert at specific position
    sb.insert(4," Core");
    System.out.println(sb);

//   1️⃣4️⃣.2️⃣ delete --> delete at specific position
    sb.delete(4,8);
    System.out.println(sb);

//   1️⃣4️⃣.3️⃣ deleteCharAt() --> delete a specific character at specific position
    System.out.println(sb.deleteCharAt(0));
//   1️⃣4️⃣.4️⃣ reverse
    System.out.println(sb.reverse());
//   1️⃣4️⃣.5️⃣ capacity --> show the allocated memory
    System.out.println(sb.capacity());
//   1️⃣4️⃣.6️⃣ length --> return the length of the stringBuilder
    System.out.println(sb.length());
  }
}
