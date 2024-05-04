package FindGrade;

import java.util.Scanner;

class FindGrade {
  public String getIndexGrade(int score) {
    String[] Grades = { "A", "B", "C", "D", "E" };
    String result = "Invalid score.";

    if(score >= 0 && score < 60) {
      result = Grades[Grades.length - 1];
    } else if(score >= 60 && score < 85) {
      result = Grades[Grades.length - (score) - 60 / 5];
    } else if(score >= 85) {
      result = Grades[0];
    }

    return result;
  }

  public String findGrade(int score) {
    String result = "Invaild score";

    return result;
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    
  }
}
