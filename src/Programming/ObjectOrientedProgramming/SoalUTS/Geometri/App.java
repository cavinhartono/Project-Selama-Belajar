package Programming.ObjectOrientedProgramming.SoalUTS.Geometri;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);

  public static void main(String[] args) {
    int choice;

    System.out.println("1. Persegi");
    System.out.println("2. Lingkaran");
    System.out.println("3. Segitiga");

    choice = ip.nextInt();

    switch (choice) {
      case 1:
        System.out.print("Masukan sisi: ");
        double sisi = ip.nextDouble();

        BangunDatar persegi = new Persegi(sisi);
        System.out.println(persegi.hitungLuas());
        break;
      case 2:
        System.out.print("Masukan jari-jari: ");
        double jari = ip.nextDouble();

        BangunDatar lingkaran = new Lingkaran(jari);
        System.out.println(lingkaran.hitungLuas());
        break;
      case 3:
        double alas = ip.nextDouble();
        double tinggi = ip.nextDouble();

        BangunDatar segitiga = new Segitiga(alas, tinggi);
        System.out.println(segitiga.hitungLuas());
        break;
      default:
        System.out.println("Tidak ada.");
        break;
    }
  }
}
