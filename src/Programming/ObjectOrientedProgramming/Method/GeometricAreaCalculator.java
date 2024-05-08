package Programming.ObjectOrientedProgramming.Method;

public class GeometricAreaCalculator {
  public double calculate(double radius) {
    return 3.14 * radius * radius; // Luas Lingkaran
  }

  public double calculate(double base, double height) {
    return 0.5 * base * height; // Luas Segitiga
  }

  public double calculate(double side) {
    return side * side; // Luas Persegi
  }
}
