package Programming.ObjectOrientedProgramming.Selection;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    ContohSoal obj = new ContohSoal();

    // Soal 1: Menentukan bilangan ganjil atau genap
    System.out.print("Masukan angka: ");
    System.out.println(obj.satu(ip.nextInt()));

    // Soal 2: Menentukan bilangan positif, negatif dan nol dengan If Statement
    System.out.print("Masukan angka: ");
    System.out.println(obj.duaIfStatement(ip.nextInt()));
    
    // Soal 2: Menentukan pilihan dengan Switch Case
    System.out.print("Masukan pilihan (A, B, dan C): ");
    obj.duaSwitchCase(ip.next().charAt(0));

    // Soal 3: Menentukan kendaraan dengan sesuai usia dan SIM
    System.out.print("Masukan usia: ");
    int age = ip.nextInt();
    
    System.out.print("Apakah Anda memiliki SIM? (ya/tidak): ");
    String lisence = ip.next();

    System.out.println(obj.tiga(age, lisence));

    // Soal 4: Menentukan nilai dengan If Statement dan Switch Case
    System.out.print("Masukkan nilai: ");
    int score = ip.nextInt();

    obj.empat(score);

    // Soal 5: Menentukan nilai dengan If Statement
    System.out.print("Masukkan nilai: ");
    score = ip.nextInt();

    System.out.println(obj.lima(score));

    // Soal 6: Menentukan bilangan positif, negatif dan nol dengan Ternary Operator
    System.out.print("Masukan pilihan (A, B, dan C): ");
    char choice = ip.next().charAt(0);
    
    System.out.println(obj.enamSwitchCaseDenganTernary(choice));
  }
}