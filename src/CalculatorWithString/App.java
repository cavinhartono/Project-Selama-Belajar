package CalculatorWithString;

import java.util.Scanner;

class CalculatorWithString {
  
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    char operator;
    double x, y, result;

    x = ip.nextDouble();
    operator = ip.next().charAt(0);
    y = ip.nextDouble();

    switch (operator) {
      case '+':
        result = x + y;
        break;
      case '-':
        result = x - y;
        break;
      case '*':
        result = x * y;
        break;
      case '/':
        result = x / y;
        break;
      default:
        result = 0;
        break;
    }
    System.out.println(result);
  }
}
