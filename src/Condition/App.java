package Condition;

public class App {
  public static void main(String[] args) {
    int x = 4 % 2;
    int y = 5 / 2;

    boolean isX = x == 1;
    boolean isY = y > 1;

    System.out.println("x = " + isX);
    
    System.out.println("y = " + isY);

    System.out.println("x XOR y = " + (isX ^ isY) );

    System.out.println("x OR y = " + (isX || isY) );

    System.out.println("x NAND y = " + (!isX && !isY) );

    System.out.println("NOT(x NOR y) = " + ( !(!isX || !isY) ));

    System.out.println("IF(x AND y || NOT(x)) = " + ( (isX && isY) || (!isX) 
                                                        ? "Salah (true)" // jika true
                                                        : "Benar (false)" // jika false
                                                    ));
  }
    
}
