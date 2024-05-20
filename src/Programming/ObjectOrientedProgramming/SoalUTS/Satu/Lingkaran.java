package Programming.ObjectOrientedProgramming.SoalUTS.Satu;

public class Lingkaran extends BangunDatar {
  double jari;

  public Lingkaran(double jari) {
    this.jari = jari;
  }

  @Override
  double hitungLuas() {
    return 3.14 * jari * jari;
  }
}
