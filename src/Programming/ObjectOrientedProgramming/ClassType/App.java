package Programming.ObjectOrientedProgramming.ClassType;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    TugasRumah obj = new TugasRumah();
    int[] numbers = { 30, 88, 15, 53 };

    obj.classNumber(2, 4);
    obj.classChar(ip.next().charAt(0));
    obj.classString("Aku sudah makan");
    obj.classArray(numbers);
    obj.classDateAndTime();
  }
}
