package FigureKata;

import java.util.Scanner;

/**
 * PrintPattern
 */
class PrintPattern {
  public void main(String text, int column) {
    int textLength = text.length() - 1;

    for (int i = 0; i < column; i++ )
    {
      for (int j = 0 ; j < column; j++ )
      {
        if (i == 0 || i == column - 1 || j == 0 || j == column - 1)
        {
          System.out.print(text.charAt(textLength--) + " ");
        }
        else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }  
}

public class App {
  private static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
      PrintPattern obj = new PrintPattern();
      obj.main(ip.nextLine(), ip.nextInt());
    } 
}
