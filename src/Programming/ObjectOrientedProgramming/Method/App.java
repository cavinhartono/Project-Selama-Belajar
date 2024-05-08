package Programming.ObjectOrientedProgramming.Method;

public class App {
  public static void main(String[] args) {
    GeometricAreaCalculator obj = new GeometricAreaCalculator();

    System.out.println("Persegi   : " + obj.calculate(4));
    System.out.println("Segitiga  : " + obj.calculate(4, 2));
    System.out.println("Lingkaran : " + obj.calculate(4));
  }
}
