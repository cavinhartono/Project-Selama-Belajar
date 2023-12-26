package FindMax;

import java.util.Scanner;

class FindMax {
  int max;
  public int findMax(int[] numbers) {
    for(int i = 0; i < numbers.length; i++){
      max = numbers[i] > numbers[0] ? numbers[i] : numbers[0];
    }
    return max;
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    int[] numbers = new int[3];
    FindMax obj = new FindMax();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = ip.nextInt();
    }

    obj.findMax(numbers);
  }
}