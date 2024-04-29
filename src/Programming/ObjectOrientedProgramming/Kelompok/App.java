package Programming.ObjectOrientedProgramming.Kelompok;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    SoalSelection obj = new SoalSelection();
    int number, choice;
    String text;

    do {
      System.out.println("Soal-soal");
      System.out.println("1. Mencari bilangan prima");
      System.out.println("2. Mencari angka bulan");
      System.out.println("3. Mengonversi calcius ke fahrenfeit");
      System.out.println("4. Jumlah huruf vokal");
      System.out.println("5. Deret bintang");
      System.out.print("Pilihan: ");
      choice = ip.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Masukan angka: ");
          number = ip.nextInt();
          obj.bilanganPrima(number);

          System.out.println();
          break;
        case 2: 
          System.out.print("Masukan angka bulan: ");
          number = ip.nextInt();
          obj.angkaBulan(number);

          System.out.println();
          break;
        case 3: 
          System.out.print("Masukan angka calsius: ");
          double calcius = ip.nextDouble();
          obj.convert(calcius);

          System.out.println();
          break;
        case 4:
          System.out.print("Masukan teks: ");
          text = ip.next();
          text += " " + ip.nextLine();
          obj.hurufVokal(text);

          System.out.println();
          break;
        case 5:
          System.out.print("Masukan angka deretan: ");
          number = ip.nextInt();
          
          System.out.println();
          obj.deretBintang(number);
          System.out.println();
          break;
        default:
          System.out.println("Tidak ada pilhan");
          break;
      }
    } while (choice != 6);
  }
}
