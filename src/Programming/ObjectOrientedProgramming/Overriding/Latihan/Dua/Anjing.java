package Programming.ObjectOrientedProgramming.Overriding.Latihan.Dua;

class Anjing extends Hewan {
  String jenis = "Anjing";

  void bunyi() {
    System.out.println("Anjing menggonggong");
  }

  void cetakJenis() {
    System.out.println("Jenis subclass: " + jenis);
    System.out.println("Jenis superclass: " + super.jenis);
  }
}
