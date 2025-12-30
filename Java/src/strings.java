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

  }
}
