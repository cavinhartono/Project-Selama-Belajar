package AgeCalculator;

import java.util.Scanner;

/**
 * Dates
 */
class Dates {
  public int date, year;
  public String month;

  public Dates(int date, String month, int year) {
    this.date = date;
    this.month = month;
    this.year = year;
  }
}

class UsingArray {
  public void findAge(Dates birth, Dates current) {
    int years = current.year - birth.year, 
      months = getMonth(current.month) - getMonth(birth.month), // diconvert dari nama bulan ke jumlah hari
      days = current.date - birth.date;

    if (days < 0) {
      days += getDays(getMonth(current.month));
      months--;
    }

    if (months < 0) {
      months += 12;
      years--;
    }

    String result = (years < 0) // Apakah tahun adalah 0? 
                      ? months + " bulan " + days + " hari." // true, menampilkan tahun yang sama
                      : years + " tahun " + months + " bulan " + days + " hari."; // false, menampilkan tahun yang berbeda
    
    System.out.println("\n" + result);
  }

  public int getMonth(String month) {
    String[] Months = { "januari", "februari", "maret", "april", 
                        "mei", "juni", "juli", "agustus", 
                        "september", "oktober", "november", "desember" };

    for (int i = 0; i < Months.length; i++) {
      // Ia akan mengecak "Apakah yang di input ada di bulan-bulan?"
      if (Months[i].equalsIgnoreCase(month)) {
        return i;
      }
    }

    return -1; // Jika nama bulan tidak ditemukan, karena input yang typo
  }

  public int getDays(int month) {
    int[] Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    return Days[month];
  }
}

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
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    UsingArray obj = new UsingArray();

    System.out.print("Tanggal Lahir     : ");
    String birth = ip.nextLine();
    
    System.out.print("Tanggal Sekarang  : ");
    String current = ip.nextLine();

    obj.findAge(new Dates(Integer.parseInt(birth.split(" ")[0]), birth.split(" ")[1], Integer.parseInt(birth.split(" ")[2])), 
                new Dates(Integer.parseInt(current.split(" ")[0]), current.split(" ")[1], Integer.parseInt(current.split(" ")[2])));
    /* obj.findAge(new Dates(birthDate, birthMonth, birthYear), 
                  new Dates(currentDate, currentMonth, currentYear)); */ 
  }
}
