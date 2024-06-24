package Programming.ObjectOrientedProgramming.Overriding.Latihan.Tiga;

class Animal {
  void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  void makeSound() {
    super.makeSound();
    System.out.println("Dog bark");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog obj = new Dog();

    obj.makeSound();
  }
}
