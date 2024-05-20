package Programming.ObjectOrientedProgramming.SoalUTS.Satu;

public class Persegi extends BangunDatar {
  double sisi;

  Persegi(double sisi) {
    this.sisi = sisi;
  }

  @Override
  public double hitungLuas() {
    return sisi * sisi;
  }
}
