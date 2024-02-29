package PrintPattern;

/**
 * PrintPattern
 */
class PrintPattern {
  public void printPattern(int column, int row) {
    for (int i = 0; i < column; i++) {
      for (int j = row; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 2; i <= column; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

public class App {
  public static void main(String[] args) {
    PrintPattern obj = new PrintPattern();
    obj.printPattern(10, 5);
  }
}
