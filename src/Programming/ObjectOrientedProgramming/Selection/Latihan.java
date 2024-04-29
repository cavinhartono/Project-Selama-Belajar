package Programming.ObjectOrientedProgramming.Selection;

class Soal {
  public void satu(int x, int y) {
    int z = x + y;

    System.out.println("Hasil: " + z);

    if (z > 10) {
      System.out.println("Nilai lebih besar dari 10");
    } else {
      System.out.println("Nilai kurang dari 10");
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("i ke-" + i);
    }
  }
}

public class Latihan {
  public static void main(String[] args) {
    Soal obj = new Soal();
    obj.satu(5, 5);
  }
}
