package Programming.ObjectOrientedProgramming.Abstrack.Tugas;

public class App {
  public static void main(String[] args) {
    BangunDatar persegi = new Persegi(4);
    BangunDatar lingkaran = new Lingkaran(6);

    System.out.println("Luas Persegi  : " + persegi.hitungLuas());
    System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
  }
}