package UkuranTanah;

/*
  Peter adalah orang keren yang tepat waktu dan senang menolong, 
  sama seperti kamu. Kali ini dia mengajak kamu untuk membantu 
  dia dalam membantu orang lain :) 

  Suatu hari dia diminta bantuan oleh temannya. Namun dia terlebih 
  dahulu berjanji kepada Paman Ben untuk membantu mengecat dinding 
  ruang tamu. Bantulah Peter untuk memberi kepastian kepada temannya 
  berapa lama temannya harus menunggu, jika:
    • Ruang tamu berbentuk persegi. Atap dan lantai tidak di cat ya :)
    • Waktu mengecat dalam menit sama dengan 5 x (Luas Daerah Pengecatan)

  Contoh:
    Input:              Output:
    8                   256m persegi
    8                   1280 menit
    8

*/ 

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    int p = ip.nextInt(), l = ip.nextInt(), t = ip.nextInt();

    int luas = menghitungLuas(p, l, t);
    
    int waktu = menghitungWaktu(luas);

    System.out.println(luas + "km persegi");
    System.out.println(waktu + " menit");
  }

  public static int menghitungLuas(int p, int t, int l) {
    return 2 * (p * t + l * t);
  }

  public static int menghitungWaktu(int luas) {
    return 5 * luas; // menghitung waktu berdasarkan 5 menit dikalikan luas ruangan
  }
}

