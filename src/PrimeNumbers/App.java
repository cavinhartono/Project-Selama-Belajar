package PrimeNumbers;

import java.util.Scanner;

class PrimeNumbers {
  public boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    
    return number < 2 ? false : true;
  }

  public void calculated(int length) {
    for (int j = 0; j <= length; j++) {
      if(isPrime(j)) {
        print(j);
      }
    }
  }

  public void print(int number) {
    System.out.print(number + " ");
  }
}

public class App {
  private static Scanner ip = new Scanner(System.in);
  public static void main(String[] args) {
    PrimeNumbers obj = new PrimeNumbers();
    obj.calculated(ip.nextInt());
  }
}

// public class App {
//   public static void main(String[] args) {
//     // String primeNumbers = "";
//     int[] primeNumbers = new int[10];
//     int index = 0;

//     for (int i = 1; i <= 10; i++) {
//       int counter = 0;

//       for(int j = i; j >= 1; j--) {
//         if (i % j == 0) counter++;
//       }
      
//       if (counter == 2) {
//         // primeNumbers += i + " ";
//         primeNumbers[index] = i;
//         index++;
//       }
//     }

//     for (int number : primeNumbers) {
//       System.out.print(number + " ");
//     }
//   }
// }