package Programming.ObjectOrientedProgramming.Kalkulator;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    double x = 0, y = 0, calculated;
    String result = null;
    char loop = 'n';
    int choice = 0;

    do {
      System.out.println("Pilih operasi matematika (1/2/3/4)");
      System.out.println("1. Perjumlahan");
      System.out.println("2. Pengurangan");
      System.out.println("3. Perkalian");
      System.out.println("4. Pembagian");
      System.out.print("Pilihan: ");
      choice = ip.nextInt();
      
      if (choice < 5) {
        System.out.print("Masukan nilai X               : ");
        x = ip.nextDouble();

        System.out.print("Masukan nilai Y               : ");
        y = ip.nextDouble();
      } else {
        result = "Error: Pilihan anda tidak ada!";
      }

      switch (choice) {
        case 1:
          calculated = x + y;
          result = "Hasil: " + calculated;
          break;
        case 2:
          calculated = x - y;
          result = "Hasil: " + calculated;
          break;
        case 3:
          calculated = x * y;
          result = "Hasil: " +  calculated;
          break;
        case 4:
          if (y != 0) {
            calculated = x / y;
            result = "Hasil: " +  calculated;
          } else {
            result = "Error: Tidak dapat membagi dengan nol!";
          }
          break;
      }

      System.out.println("\n" + result);

      System.out.print("\nApakah ingin melakukan perhitungan lagi? (y/n) ");
      loop = ip.next().charAt(0);
    } while (Character.toLowerCase(loop) == 'y');
  }
}