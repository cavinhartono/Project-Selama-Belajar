package StrategiAlgoritma.TugasPraktek;

public class Faktorial {
  public static void main(String args[]) {
    int n = 5;
    System.out.println("Faktorial dari " + n + " adalah " + factorial(n));
  }

  public static int factorial(int n) {
    return n >= 1 
          ? n * factorial(n - 1) 
          : 1;
  }
}
