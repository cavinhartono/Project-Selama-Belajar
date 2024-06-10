package Programming.ObjectOrientedProgramming.Method.Materi;

public class NumberManipulation {
  public int multiply(int a, int b) {
    return a * b;
  }

  public void printSquare(int num) {
    int square = num * num;
    System.out.println("Kuadrat dari " + num + " adalah " + square);
  }

  public static void main(String[] args) {
    NumberManipulation obj = new NumberManipulation();

    int result = obj.multiply(5, 10);
    System.out.println("Hasil perkalian : " + result);

    obj.printSquare(7);
  }
}
