package DataStructure.String;

class KonsepString {
  public String insert(String text, String toInsert, int index) {
    return text.substring(0, index) + toInsert + text.substring(index);
  }

  public String delete(String text, int start, int end) {
    return text.substring(0, start) + text.substring(end);
  }
}

public class App {
  public static void main(String[] args) {
    KonsepString obj = new KonsepString();
    String a = "Teknik informatika", b = "Sisteminformasi";

    // 1. x = concat(substr(a, 3, 5), b);
    String aSubString = a.substring(2, 7);
    
    String x = aSubString.concat(b);

    // 2. y = length(x);
    int y = x.length();

    // 3. z = insert(x, b, 3);
    // Tanpa menggunakan Library
    String z = obj.insert(x, b, 2);

    // Menggunakan Library
    StringBuilder zWithStringBuilder = new StringBuilder(x).insert(2, b);

    // 4. c = delete(a, 4, 5);
    // Tanpa menggunakan Library
    String c = obj.delete(a, 3, 8);

    // Menggunakan Library
    StringBuilder cWithStringBuilder = new StringBuilder(a).delete(3, 8);

    // 5. d = delete(concat(substr(a, 2, 3), c), 2, 2);
    // Tanpa menggunakan Library 
    String dSubstring = a.substring(1, 4);
    String dConcat = dSubstring.concat(c);
    String d = obj.delete(dConcat, 1, 3);
    
    // Menggunakan Library
    StringBuilder dWithStringBuilder = new StringBuilder(a.substring(1, 4) + cWithStringBuilder)
                                                          .delete(1, 3);

    // Output
    System.out.println("X = '" + x + "'");
    System.out.println("Y = " + y + " (dihitung tanpa tanda kutip)");
    System.out.println("Z = '" + z + "' (tanpa library)");
    System.out.println("   '" + zWithStringBuilder + "' (dengan StringBuilder)");
    System.out.println("C = '" + c + "'");
    System.out.println("   '" + cWithStringBuilder + "' (dengan StringBuilder)");
    System.out.println("D = '" + d + "'");
    System.out.println("   '" + dWithStringBuilder + "' (dengan StringBuilder)");
  }
}