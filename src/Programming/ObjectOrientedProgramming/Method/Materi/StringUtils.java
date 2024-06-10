package Programming.ObjectOrientedProgramming.Method.Materi;

public class StringUtils {
  // Method untuk menggabungkan dua string
  public String concatenate(String str1, String str2) {
    return str1 + str2;
  }

  // Method untuk menggabungkan tiga string
  public String concatenate(String str1, String str2, String str3) {
    return str1 + str2 + str3;
  }

  // Method untuk mengonversi angka menjadi string
  public String convertToString(int number) {
    return String.valueOf(number);
  }

  public static void main(String[] args) {
    StringUtils utils = new StringUtils();

    // Memanggil method concatenate dengan dua string
    String result1 = utils.concatenate("Hello, ", "world!");
    System.out.println(result1);

    // Memanggil method concatenate dengan tiga string
    String result2 = utils.concatenate("Java", " is", " awesome!");
    System.out.println(result2);

    // Memanggil method convertToString
    String numString = utils.convertToString(100);
    System.out.println("Hasil konversi: " + numString);
  }
}
