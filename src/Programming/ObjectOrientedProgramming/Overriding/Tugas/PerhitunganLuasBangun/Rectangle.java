package Programming.ObjectOrientedProgramming.Overriding.Tugas.PerhitunganLuasBangun;

public class Rectangle extends Shape {
  private double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}
