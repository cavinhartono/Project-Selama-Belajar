package FindGrade;

import java.util.Scanner;

class FindGrade {
  public double avarageGrade(int[] scores) {
    double sum = 0;
    for (int score : scores) {
      sum += score;
    }

    return sum / scores.length;
  }

  public char[] getGrade(int[] scores) {
    char[] results = new char[scores.length];
    
    for (int i = 0; i < scores.length; i++) {
      if(scores[i] >= 0 && scores[i] < 50) {
        results[i] = 'E';
      } else if(scores[i] >= 50 && scores[i] < 65) {
        results[i] = 'D';
      } else if(scores[i] >= 65 && scores[i] < 75) {
        results[i] = 'C';
      } else if(scores[i] >= 75 && scores[i] < 85) {
        results[i] = 'B';
      } else {
        results[i] = 'A';
      }
    }

    return results;
  }

  public void printGrades(String[] Students, char[] Grades) {
    for (String name : Students) {
      for (char grade : Grades) {
        System.out.println(name + ": " + grade);
      }
    }
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    FindGrade obj = new FindGrade();

    String[] Students = new String[ip.nextInt()];
    int[] Scores = new int[Students.length];
    for(int i = 0; i <= Students.length; i++) {
      Students[i] = ip.next();
      Scores[i] = ip.nextInt();
    }

    obj.printGrades(Students, obj.getGrade(Scores));
  }
}
