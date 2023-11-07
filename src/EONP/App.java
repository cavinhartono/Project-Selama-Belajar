package EONP;

import java.util.Scanner;

/**
 * checkNumberWithRound
 */
class checkNumberWithRound {
  Scanner ip = new Scanner(System.in);

  public void menu() {
    System.out.println("Cek nomor! (Apakah ganjil-genap?)");
    int number = ip.nextInt();

    if (number > 0) {
      if (number % 2 == 0) System.out.println("Genap Positif");
      else System.out.println("Ganjil Positif");
    } else if (number < 0)  {
      if (number % 2 == 0) System.out.println("Genap Negatif");
      else System.out.println("Ganjil Negatif");
    } else System.out.println("Bilangan adalah nol.");
  }
}

public class App {
  public static void main(String[] args) {
    checkNumberWithRound obj = new checkNumberWithRound();
    obj.menu();
  }
}
