package Programming.ObjectOrientedProgramming.SoalUTS.AngkaBulan;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Masukan bulan (1-12): ");
    angkaBulan(ip.nextInt());
  }

  public static void angkaBulan(int number) {
    String result = "";
    switch (number) {
      case 1:
        result = "Januari";
        break;
      case 2:
        result = "Februari";
        break;
      case 3:
        result = "Maret";
        break;
      case 4:
        result = "April";
        break;
      case 5:
        result = "Mei";
        break;
      case 6:
        result = "Juni";
        break;
      case 7:
        result = "Juli";
        break;
      case 8:
        result = "Agustus";
        break;
      case 9:
        result = "September";
        break;
      case 10:
        result = "Oktober";
        break;
      case 11:
        result = "November";
        break;
      case 12:
        result = "Desember";
        break;

      default:
        result = "Angka bulan tidak vaild";
        break;
    }

    System.out.println(result);
  }
}
