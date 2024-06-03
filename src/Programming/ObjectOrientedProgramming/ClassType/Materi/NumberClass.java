package Programming.ObjectOrientedProgramming.ClassType.Materi;

public class NumberClass {
  public static void main(String[] args) {
    String numStr = "123";

    int numInt = Integer.parseInt(numStr);
    System.out.println("numInt    : " + numInt);

    double numDouble = Double.parseDouble(numStr);
    System.out.println("numDouble : " + numDouble);

    int intValue = 42;
    Integer intObject = Integer.valueOf(intValue);
    System.out.println("intObject : " + intObject);
  }
}
