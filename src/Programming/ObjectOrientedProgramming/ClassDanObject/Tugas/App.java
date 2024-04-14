package Programming.ObjectOrientedProgramming.ClassDanObject.Tugas;

public class App {
  public static void main(String[] args) {
    Staff obj1 = new Staff("12345701", "John Doe", "Staff One");
    Staff obj2 = new Staff("13345701", "John Doe", "Staff Two");

    obj1.setName("Michael Johnson");
    obj1.info();

    System.out.println("NIM   : " + obj2.getNip());
    System.out.println("Prodi : " + obj2.getStudy());
  }
}