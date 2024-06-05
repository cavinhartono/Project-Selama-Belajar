package Programming.ObjectOrientedProgramming.ClassType;

import java.util.Scanner;

public class App {
  private static Scanner ip = new Scanner(System.in);

  public static void main(String[] args) {
    TugasRumah obj = new TugasRumah();
    int[] Numbers = { 30, 88, 15, 53 };
    char ch = 'A';

    obj.classNumber(2, 4);
    obj.classChar(ch);
    obj.classString("Aku sudah makan");
    obj.classArray(Numbers);
    obj.classDateAndTime();
  }
}
