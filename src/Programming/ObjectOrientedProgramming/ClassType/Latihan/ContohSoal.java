package Programming.ObjectOrientedProgramming.ClassType.Latihan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContohSoal {
  public void numberClass() {
    int x = 10, y = 5;

    String xStr = Integer.toString(x);
    String yStr = Integer.toString(y);

    String result = xStr + yStr;
    System.out.println(result);
  }

  public void charClass() {
    char ch = 'A';

    if (Character.isLetter(ch)) {
      System.out.println(ch + " adalah huruf");
    } else {
      System.out.println(ch + " bukan huruf");
    }
  }

  public void stringClass() {
    String str = "Hello World";

    String strSubString = str.substring(0, 5);
    System.out.println("Substring: " + strSubString);
  }

  public void arrayClass() {
    int[] Numbers = { 1, 2, 3, 4, 5 };

    for (int number : Numbers) {
      System.out.println(number);
    }
  }

  public void datetimeClass() {
    LocalDate currentDate = LocalDate.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDate = currentDate.format(formatter);

    System.out.println("Tanggal saat ini: " + formattedDate);
  }

}
