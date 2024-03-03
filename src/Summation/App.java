package Summation;

import java.util.Scanner;

/**
 * Summation
 */
class Summation {
  public int sum(int[] numbers) {
    int result = 0;

    for (int number : numbers) {
      result += number;
    }
    return result;
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    Summation obj = new Summation();
    int[] numbers = new int[ip.nextInt()];
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = ip.nextInt();
    }

    System.out.println(obj.sum(numbers));
  }
}