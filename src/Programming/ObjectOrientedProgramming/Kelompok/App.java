package Programming.ObjectOrientedProgramming.Kelompok;

import java.util.Scanner;

class SoalSelection {
  public void bilanganPrima(int number) {
    boolean flag = false;
    for (int i = 2; i <= (number / 2); i++) {
      if(number % i == 0) {
        flag = true;
        break; 
      }
    }

    if (!flag) {
      System.out.println(number + " adalah bilangan prima");
    } else {
      System.out.println(number + " adalah bukan bilangan prima");
    }
  }

  public String angkaBulan(int number) {
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

    return result;
  }

  public void convert(double number) {
    double calcius = number, fahrenheit = 0.0;
    fahrenheit = 32 + (calcius * 1.8);

    System.out.println(fahrenheit);
  }

  public void hurufVokal(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
  
    System.out.println("Jumlah huruf vokal " + count);
  }

  public void deretBintang(int number) {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      } 
      System.out.println();
    }
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    SoalSelection obj = new SoalSelection();
    int number, choice;

    do {
      System.out.println("Soal-soal");
      System.out.println("1. Mencari bilangan prima");
      System.out.println("2. Mencari angka bulan");
      System.out.println("3. Mengonversi calcius ke fahrenfeit");
      System.out.println("4. Jumlah huruf vokal");
      System.out.println("5. Deret bintang");
      choice = ip.nextInt();

      switch (choice) {
        case 1:
          number = ip.nextInt();
          obj.bilanganPrima(number);
          break;
        case 2: 
          number = ip.nextInt();
          obj.angkaBulan(number);
          break;
        case 3: 
          double calcius = ip.nextInt();
          obj.convert(calcius);
          break;
        case 4:
          String text = ip.nextLine();
          obj.hurufVokal(text);
          break;
        case 5:
          number = ip.nextInt();
          obj.deretBintang(number);
          break;
        default:
          System.out.println("Tidak ada pilhan");
          break;
      }
    } while (choice >= 5);
  }
}
