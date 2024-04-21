package Programming.ObjectOrientedProgramming.ClassDanObject;

public class Mobil {
  private String name, color, transmission;
  private int year;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Mobil(String name, String color, String transmission, int year) {
    this.name = name;
    this.color = color;
    this.transmission = transmission;
    this.year = year;
  }

  public void start() {
    System.out.println("Mobil menyala abangkuh!");
  }
  
  public void info() {
    System.out.println("Merek: " + getName());
    System.out.println("Warna: " + getColor());
    System.out.println("Tahun: " + getYear());
    System.out.println();
  }
}

class Car {
  String brand, color;

  public void start() {
    System.out.println("Mobil " + brand + " berwarna " + color + " sedang aktif.");
  }
}