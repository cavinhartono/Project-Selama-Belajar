package Programming.Basic;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    boolean isActive = true;

    Scanner ip = new Scanner(System.in);

    do {
      clearScreen();

      System.out.println("1. List Buku");
      System.out.println("2. Cari Buku");
      System.out.println("3. Tambah Buku");
      System.out.println("4. Ubah Buku");
      System.out.println("5. Hapus Buku");

      System.out.print("\n Pilihan Anda: ");
      int choice = ip.nextInt();

      switch (choice) {
        case 1:
          System.out.println("List Buku \n");
          break;
        case 2:
          System.out.println("Cari Buku \n");
          
          break;
        case 3:
          System.out.println("Tambah Buku \n");
          
          break;
        case 4:
          System.out.println("Ubah Buku \n");
          
          break;
        case 5:
          System.out.println("Hapus Buku \n");
          
          break;
        default:
          break;
      }

    } while (isActive);
  }

  private static void clearScreen() {
    try {
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.println("\033\143");
      }
    } catch (Exception e) {
      System.err.println("Tidak bisa melakukan clean screen");
    }
  }
}
