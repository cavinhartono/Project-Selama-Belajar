package Programming.ObjectOrientedProgramming.Kalkulator;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    double x = 0, y = 0, result = 0;
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

      System.out.print("Masukan nilai X               : ");
      x = ip.nextDouble();
      
      System.out.print("Masukan nilai Y               : ");
      y = ip.nextDouble();

      switch (choice) {
        case 1:
          result = x + y;
          break;
        case 2:
          result = x - y;  
          break;
        case 3:
          result = x * y;
          break;
        case 4:
          if (y != 0) 
            result = x / y;
          else 
            System.err.println("\nError: Tidak dapat membagi dengan nol!");
          break;
        default:
          System.err.println("\nError: Pilihan Anda tidak ada!");
          break;
      }

      System.out.println("\nHasil                         : " + result);

      System.out.print("Apakah ingin melakukan perhitungan lagi? (y/n) ");
      loop = ip.next().charAt(0);
    } while (Character.toLowerCase(loop) == 'y');
  }
}