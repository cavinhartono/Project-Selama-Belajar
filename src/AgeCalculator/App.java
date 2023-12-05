package AgeCalculator;

import java.util.Scanner;

/**
 * UsingSwitch
 */
// class UsingSwitch {
//   int day;
//   public void main(monthName) {
//     switch (monthName) {
//       case "januari":
//         day = 31;
//         break;
//       case "februari":
//         day = 29;
//         break;
//       case "maret":
//         day = 31;
//         break;
//       case "april":
//         day = 30;
//         break;
//       case "mei":
//         day = 31;
//         break;
//       case "juni":
//         day = 30;
//         break;
//       case "juli":
//         day = 31;
//         break;
//       case "agustus":
//         day = 31;
//         break;
//       case "september":
//         day = 30;
//         break;
//       case "oktober":
//         day = 31;
//         break;
//       case "november":
//         day = 30;
//         break;
//       case "desember":
//         day = 31;
//         break;
//       default:
//         System.err.println("Masukan nama bulan yang bener");
//         break;
//     }
//     return day;
//   }
// }

class AgeCalculator {
  public void findAge(int currentDate, int currentMonth, int currentYear, int birthDate, int birthMonth, int birthYear) {
    int[] Dates = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    if (birthDate > currentDate) {
      currentDate += Dates[birthMonth - 1];
      currentMonth -= 1;
    }

    if (birthMonth > currentMonth) {
      currentYear -= 1;
      currentMonth += 12;
    }

    int resulted_date = currentDate - birthDate;
    int resulted_month = currentMonth - birthMonth;
    int resulted_year = currentYear - birthYear;

    System.out.println(resulted_year + " tahun " + resulted_month + " bulan " + resulted_date + " hari.");
  }
}

public class App {
  public static void main(String[] args) {
    // String[] Months = { "januari", "februari", "maret", "april", "mei", "juni", "juli", "agustus", "september", "oktober", "november", "desember" };
    // int[] Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    AgeCalculator obj = new AgeCalculator();
    obj.findAge(5, 12, 2023, 25, 5, 2004);

  }
}