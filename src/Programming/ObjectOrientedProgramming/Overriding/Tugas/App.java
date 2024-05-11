package Programming.ObjectOrientedProgramming.Overriding.Tugas;

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

public class App {
  public static void main(String[] args) {
    // Soal 1:
    Vehicle vehicle = new Vehicle();
    Car car = new Car();
    Bike bike = new Bike();

    vehicle.displayInfo();
    car.displayInfo();
    bike.displayInfo();

    // Soal 2:
    Animal animal = new Animal();
    Cat cat = new Cat();
    Dog dog = new Dog();

    animal.makeSound();
    cat.makeSound();
    dog.makeSound();

    // Soal 3:
    Shape shape = new Shape();
    Circle circle = new Circle(4);
    Rectangle rectangle = new Rectangle(2, 8);

    shape.calculateArea();
    circle.calculateArea();
    rectangle.calculateArea();
  }
}
