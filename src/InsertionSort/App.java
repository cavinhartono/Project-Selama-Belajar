package InsertionSort;

import java.util.Scanner;

/**
 * InsertionSort
 */
class InsertionSort {
  private static Scanner ip = new Scanner(System.in);
  int[] numbers = new int[3];

  public void sort(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      int key = nums[i];
      int j = i - 1;

      while (j >= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j -= 1;
      }

      nums[j + 1] = key;

    }
  }

  public void printArray() {
    for (int i : numbers) {
      System.out.print(i + " ");
    }
  }

  public void menu() {
    System.out.println("Masukan nilai x, y, dan z!");

    for (int i = 0; i < numbers.length; i++) {
      int number = ip.nextInt();
      numbers[i] = number;
    }

    sort(numbers);

    printArray();

  }

}

public class App {
  public static void main(String[] args) {
    InsertionSort obj = new InsertionSort();
    obj.menu();
  }
}
