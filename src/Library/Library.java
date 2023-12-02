package Library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Library {
  private static Scanner ip = new Scanner(System.in);

  public void mainMenu() {
    int choice;

    do {
      System.out.println("Selamat Datang di Perpustakaan");
      System.out.println("1.  List");
      System.out.println("2.  Cari");
      System.out.println("3.  Tambah");
      System.out.println("4.  Update");
      System.out.println("5.  Hapus");
      System.out.println("6.  Keluar");

      System.out.print("\nMasukan Pilihan: ");
      choice = ip.nextInt();

      switch (choice) {
        case 1:
          System.out.println("List Semua Buku\n");
          read();
          break;
        case 2:
          System.out.println("Cari Buku\n");
          break;
        case 3:
          System.out.println("Tambah Buku\n");
          break;
        case 4:
          System.out.println("Update Buku\n");
          break;
        case 5:
          System.out.println("Update Buku\n");
          break;
        default:
          System.err.println("Masukan pilihan yang bener!");
          break;
      }

    } while (choice != 6);
  }

  private static void read() {
    try {
      FileReader fileIp = new FileReader("database.txt");
      BufferedReader bufferIp = new BufferedReader(fileIp);
    } catch (Exception e) {
      System.err.println("Database tidak ditemukan. \nSilahkan tambahkan data!");
      return;
    }
  }
}
