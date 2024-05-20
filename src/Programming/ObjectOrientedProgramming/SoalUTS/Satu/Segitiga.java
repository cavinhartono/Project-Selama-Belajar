package Programming.ObjectOrientedProgramming.SoalUTS.Satu;

public class Segitiga extends BangunDatar {
  double alas, tinggi;

  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  @Override
  double hitungLuas() {
    return 0.5 * alas * tinggi;
  }
}
