package FindDiscount;

import java.util.Scanner;

class FindDiscount {
  float total = 0;

  public void result(float[] Prices) {
    for (int i = 0; i < Prices.length; i++) {
      calculated(Prices[i]);
    }
    print();
  }

  public float calculated(float price) {
    return total += price;
  }

  public void print() {
    if (total >= 200000) {
      System.out.println("\nAnda mendapatkan diskon 10%!");
      total -= (total * 0.1);
    }
    System.out.println("Total Rp. " + (int) total);
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Berapa jumlah produk? ");
    float[] Prices = new float[ip.nextInt()];
    
    for (int j = 0; j < Prices.length; j++) {
      Prices[j] = ip.nextFloat();
    }

    FindDiscount obj = new FindDiscount();
    obj.result(Prices);
  }
}
