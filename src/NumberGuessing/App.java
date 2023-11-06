package NumberGuessing;

import java.util.Scanner;

/**
 * NumberGuessing
 */
class Games {
  int num = 1 + (int) (10 * Math.random()), changes = 5, i;
  
  private static Scanner ip = new Scanner(System.in);
  
  public void mainMenu() {
    System.out.println("Pilih sebuah angka dari 1 - 10 \nBersedia? Mulai...");
    
    for (i = 0; i <= changes; i++) {
      System.out.print("Tebak angka!!! ");
      int choice = ip.nextInt();

      if (num == choice) {
        System.out.println("Selamat! Anda berhasil menebak angka");
        break;
      } else if (num > choice) {
        System.err.println("Hampir... nomor tersebut lebih besar!");
      } else if (num < choice && i != changes - 1) {
        System.out.println("Angka tersebut lebih kecil dari " + choice);
      } 

      if (i == changes) System.out.println("Kesempatanmu telah habis dan jawaban yang bener adalah " + num);

    }
    

  }

}

public class App {
  public static void main(String[] args) {
    Games obj = new Games();
    obj.mainMenu();
  }
}
