package Programming.Basic;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    String name;
    int age;
    double height;
    char gender;
    boolean isMarried;

    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukan nama Anda           : ");
    name = input.nextLine();

    System.out.print("Masukan umur Anda           : ");
    age = input.nextInt();

    System.out.print("Masukan jenis kelamin Anda  : ");
    gender = input.next().charAt(0);

    System.out.print("Masukan tinggi badan Anda   : ");
    height = input.nextDouble();

    System.out.print("Masukan status menikah Anda : ");
    isMarried = input.nextBoolean();

    System.out.println("Nama            : " + name);
    System.out.println("Umur            : " + age);
    System.out.println("Jenis Kelamin   : " + gender);
    System.out.println("Tinggi Badan    : " + height);
    System.out.println("Status Menikah  : " + isMarried);
  }
}
