package Programming.ObjectOrientedProgramming.Kelompok;

public class SoalLooping {
  public void deretGenap() {
    for (int i = 2; i <= 20; i += 2) {
      System.out.println(i + " ");
    }
  }

  public void deretGanjil() {
    int i = 1;
    while (i <= 15) {
      System.out.println(i);
      i += 2;
    }
  }

  public void cekBilanganPositif(int number) {
    int positiveNumber = 0;

    do {
      if (number >= 0) {
        positiveNumber += number;
      }
    } while (number >= 0);

    System.out.println("Jumlah bilangan positif: " + positiveNumber);
  }

  public void segitigaTerbalik(int height) {
    for (int i = height; i >= 1; i--) {
      for (int j = 1; j <= (height - 1); j++) {
        System.out.print(" ");
      }
      for(int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

class App {
  public static void main(String[] args) {
    SoalLooping obj = new SoalLooping();
    // obj.cekBilanganPositif();
    // obj.deretGenap();
    // obj.deretGanjil();
    obj.segitigaTerbalik(4);
  }
}
