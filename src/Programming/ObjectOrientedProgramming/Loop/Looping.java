package Programming.ObjectOrientedProgramming.Loop;

class Latihan {
  public void satu() {
    for (int i = 1; i <= 10; i++) {
      if(i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  public void dua() {
    int i = 1, jumlah = 0;
    while(i <= 5) {
      jumlah += i;
      i++;
    }

    System.out.println(jumlah);
  }

  public void tiga() {
    for(int i = 5; i >= 1; i--) {
      for(int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void empat() {
    for (int i = 1; i <= 10; i++) {
      for(int j = 1; j <= 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}

public class Looping {
  public static void main(String[] args) {
    Latihan obj = new Latihan();
    obj.tiga();
  }
}
