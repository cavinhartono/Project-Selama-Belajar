package Programming.ObjectOrientedProgramming.TipeData;

import java.util.Scanner;

class App {
  public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);

    System.out.print("Masukan nama          : ");
    final String name = ip.nextLine();

    System.out.print("Masukan umur          : ");
    int age = ip.nextInt();

    System.out.print("Masukan berat badan   : ");
    double weight = ip.nextDouble();

    System.out.print("Masukan jenis kelamin : ");
    char gender = ip.next().charAt(0);

    System.out.print("Status mahasiswa      : "); 
    boolean isStudent = ip.nextBoolean();

    

  }
}
