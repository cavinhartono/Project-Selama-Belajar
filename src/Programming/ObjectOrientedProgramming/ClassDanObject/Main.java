package Programming.ObjectOrientedProgramming.ClassDanObject;

public class Main {
  public static void main(String[] args) {
    Mobil mbl1 = new Mobil("Sigra", "White", "Manual", 2021);
    Mobil mbl2 = new Mobil("Yaris", "Yellow", "Matic", 2018);
    Mobil mbl3 = new Mobil("Kona EV", "Blue", "Matic", 2023);

    mbl1.info();
    mbl2.info();
    mbl3.info();
  }
}
