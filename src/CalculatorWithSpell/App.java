package CalculatorWithSpell;

import java.util.Scanner;

class CalculatorWithSpell {
  String[] Units = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
  String[] Dozens = {"sepuluh", "sebelas", "dua belas", "tiga belas", "empat belas", "lima belas", "enam belas", "tujuh belas", "delapan belas", "sembilan belas"};
  String[] Tens = {"", "sepuluh", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"};
  String[] Thousands = {"", "ribu", "juta", "miliar"};

  public String numberToText(int number) {
    String result = "";
    int position = 0;

    if (number == 0) {
      return "nol";
    }

    while(number > 0) {
      if (number % 1000 != 0) {
        result = toUnit((int) (number % 1000)) + Thousands[position] + " " + result;
      }
      number /= 1000;
      position++;
    }

    return result.trim();
  }

  public String toUnit(int number) {
    String result = "";
    if (number < 10) {
      result = Units[number];
    } else if (number < 20) {
      result = Dozens[number];
    } else {
      int ten = number / 10, unit = number % 10;
      result = Tens[ten] + " " + Units[unit];
    }

    return result;
  }
}

public class App {
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    CalculatorWithSpell calculatorWithSpell = new CalculatorWithSpell();
    int x = input.nextInt(), y = input.nextInt();
    System.out.println(calculatorWithSpell.numberToText((int) (x + y)));
  }
}
