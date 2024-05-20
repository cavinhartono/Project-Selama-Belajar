package Programming.ObjectOrientedProgramming.SoalUTS.BIlanganPrima;

import java.util.Scanner;

class PrimeNumbers {
  public boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    
    return number < 2 ? false : true;
  }

  public void calculated(int length) {
    for (int j = 0; j <= length; j++) {
      if(isPrime(j)) {
        print(j);
      }
    }
  }

  public void print(int number) {
    System.out.print(number + " ");
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    PrimeNumbers obj = new PrimeNumbers();
    obj.calculated(ip.nextInt());
  }
}