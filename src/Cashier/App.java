package Cashier;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    int[] products = new int[ip.nextInt()];
    double total = 0;

    for (int i = 0; i < products.length; i++) {
      products[i] = ip.nextInt();
    }

    for (int product : products) {
      total += product;
    }

    if (total >= 200000) {
      total -= (total * 0.30);
    }

    System.out.println("Rp. " + total);
  }
}