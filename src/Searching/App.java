package Searching;

import java.util.Scanner;
import InsertionSort.*; // local InsertionSort/App.java

class Searching {
  public int linearSearch(int numbers[], int number) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == number) {
        return i;
      }
    }

    return -1; // jika tidak ada
  }

  public int binarySearch(int numbers[], int number) {
    for(int m = 0; m < numbers.length; m++) {
      if (numbers[m] == number) {
        return m;
      }

      if(numbers[m] < number) {

      }

      if(numbers[m] > number) {
        
      }
    }

    return -1;
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    Searching obj = new Searching();
    int[] numbers = { 44, 77, 32, 63, 17, 70 };
    
    int result = obj.linearSearch(numbers, ip.nextInt());
    System.out.println(result == -1 ? "Tidak ada" : ("Berada di " + result));
  }
}
