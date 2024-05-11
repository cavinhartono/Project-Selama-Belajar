package Programming.ObjectOrientedProgramming.Overriding.Tugas.PerhitunganLuasBangun;

public class Circle extends Shape {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}
