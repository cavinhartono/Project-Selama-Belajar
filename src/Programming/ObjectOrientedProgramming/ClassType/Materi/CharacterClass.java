package Programming.ObjectOrientedProgramming.ClassType.Materi;

public class CharacterClass {
  public static void main(String[] args) {
    char ch = 'A';

    if (Character.isLetter(ch)) {
      System.out.println(ch + " adalah huruf");
    } else {
      System.out.println(ch + " bukan huruf");
    }
  }
}