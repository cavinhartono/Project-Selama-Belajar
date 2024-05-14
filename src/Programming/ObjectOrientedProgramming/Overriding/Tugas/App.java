package Programming.ObjectOrientedProgramming.Overriding.Tugas;

import java.util.Scanner;

// Import nomor 1:
import Programming.ObjectOrientedProgramming.Overriding.Tugas.Polymorphism.Bike;
import Programming.ObjectOrientedProgramming.Overriding.Tugas.Polymorphism.Car;
import Programming.ObjectOrientedProgramming.Overriding.Tugas.Polymorphism.Vehicle;

// Import nomor 2:
import Programming.ObjectOrientedProgramming.Overriding.Tugas.HewanDanSuara.Animal;
import Programming.ObjectOrientedProgramming.Overriding.Tugas.HewanDanSuara.Cat;
import Programming.ObjectOrientedProgramming.Overriding.Tugas.HewanDanSuara.Dog;

// Import nomor 3:
import Programming.ObjectOrientedProgramming.Overriding.Tugas.PerhitunganLuasBangun.Shape;
import Programming.ObjectOrientedProgramming.Overriding.Tugas.PerhitunganLuasBangun.Circle;
import Programming.ObjectOrientedProgramming.Overriding.Tugas.PerhitunganLuasBangun.Rectangle;

// Import nomor 4:
import Programming.ObjectOrientedProgramming.Overriding.Tugas.Fungsionalitas.FileLogger;

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    menu();
    System.out.print("Masukan pilihan: ");
    int choice = ip.nextInt();

    switch (choice) {
      case 1:
        // Soal 1:
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();

        vehicle.displayInfo();
        car.displayInfo();
        bike.displayInfo();
        break;
      case 2: 
        // Soal 2:
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();

        break;
      case 3:
        // Soal 3:
        Shape shape = new Shape();
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2, 8);

        System.out.println("Bangun datar   : " + shape.calculateArea());
        System.out.println("Luas Lingkaran : " + circle.calculateArea());
        System.out.println("Luas Segitiga  : " + rectangle.calculateArea());
        break;
      case 4:
        // Soal 4:
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("This is a log message.");
        break;
      default: 
        System.err.println("Pilihan Anda tidak ada.");
        break;
    }
  }

  public static void menu() {
    String[] title = new String[]{ "Polymorphism dan Overriding", "Hewan dan Suara", "Perhitungan Luas Bangun", "Penyesuaian Fungsionalitas" };
    for (int i = 0; i < title.length; i++) {
      System.out.println(i++ + ". " + title[i]);
    }
  }
}
