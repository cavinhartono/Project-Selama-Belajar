package PecahanSederhana;

import java.util.Scanner;

class PecahanSederhana {
  public String betweenNumber(double a, double b, double c, double d) {
    double x = a / b, y = c / d;
    return x < y ? "Lebih kecil" : x > y ? "Lebih besar" : "Sama";
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    PecahanSederhana obj = new PecahanSederhana();
    String[] results = new String[ip.nextInt()];

    for (int i = 0; i < results.length; i++) {
      double a = ip.nextInt(), b = ip.nextInt(), c = ip.nextInt(), d = ip.nextInt();
      String result = obj.betweenNumber(a, b, c, d);
      results[i] = result;
    }

    for (String result : results) {
      System.out.println(result);
    }
  }
}