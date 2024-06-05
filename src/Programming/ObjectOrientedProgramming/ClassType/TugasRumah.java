package Programming.ObjectOrientedProgramming.ClassType;

import java.util.Arrays; // nomor 4
// nomor 5
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TugasRumah {
  public void classNumber(double x, double y) {
    System.out.println("Penjumlahan: " + (x + y));
    System.out.println("Pengurangan: " + (x - y));
    System.out.println("Pembagian  : " + (y != 0 ? (x / y) : "Tidak dapat dibagi dengan nol."));
    System.out.println("Perkalian  : " + (x * y));
  }

  public void classChar(char ch) {
    String result = "";

    if (Character.isUpperCase(ch)) {
      result = "Karakter adalah huruf kapital";
    } else if (Character.isLowerCase(ch)) {
      result = "Karakter adalah huruf kecil";
    } else {
      result = "Karakter adalah bukan huruf";
    }

    System.out.println(result);
  }

  public void classString(String text) {
    String reverse = "";

    for (int i = 0; i <= text.length(); i++) {
      reverse += text.charAt(i);
    }

    if (text.equalsIgnoreCase(reverse)) {
      System.out.println("Kalimat tersebut adalah palindrom");
    } else {
      System.out.println("Kalimat tersebut bukan palindrom");
    }
  }

  public void classArray(int[] numbers) {
    Arrays.sort(numbers);

    System.out.println("Nilai terbesar: " + numbers[0]);
    System.out.println("Nilai terkecil: " + numbers[numbers.length - 1]);
  }

  public void classDateAndTime() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date currentDate = new Date();
    System.out.println("Tanggal dan waktu saat ini: " + dateFormat.format(currentDate));

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(currentDate);
    calendar.add(Calendar.DAY_OF_YEAR, 100);
    Date futureDate = calendar.getTime();

    System.out.println("Tanggal dan waktu setelah 100 hari: " + dateFormat.format(futureDate));
  }
}
