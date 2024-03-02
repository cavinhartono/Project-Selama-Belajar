package PecahanSederhana;

import java.util.Scanner;

class PecahanSederhana {
  public boolean isMoreNumber(double x, double y) {
    return x > y ? true : false;
  }

  public boolean isLessNumber(double x, double y) {
    return x < y ? true : false;
  }

  public String betweenNumber(double a, double b, double c, double d) {
    double x = a / b, y = c / d;
    return isLessNumber(x, y) ? "Lebih Kecil" 
      : isMoreNumber(x, y) ? "Lebih Besar" 
      : "Sama";
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    PecahanSederhana obj = new PecahanSederhana();
    String[] results = new String[ip.nextInt()];

    for (int i = 0; i < results.length; i++) {
      double a = ip.nextInt(), b = ip.nextInt(), c = ip.nextInt(), d = ip.nextInt();
      results[i] = obj.betweenNumber(a, b, c, d);
    }

    for (String result : results) {
      System.out.println(result);
    }
  }
}