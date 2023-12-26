package FindDiscount;

import java.util.Scanner;

class FindDiscount {
  public void result(float[] Prices) {

  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Berapa jumlah produk?");
    float[] Prices = new float[ip.nextInt()];

    float total = 0;

    for(int i = 0; i < Prices.length; i++) {
      Prices[i] = ip.nextFloat();
      total += Prices[i];
    }

    if (total >= 200000) {
      total -= (total * 0.1);
    }

    System.out.println(total);
  }
}
