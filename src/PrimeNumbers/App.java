public class App {
  public static void main(String[] args) {
    // String primeNumbers = "";
    int[] primeNumbers = new int[10];
    int index = 0;

    for (int i = 1; i <= 10; i++) {
      int counter = 0;

      for(int j = i; j >= 1; j--) {
        if (i % j == 0) counter++;
      }
      
      if (counter == 2) {
        // primeNumbers += i + " ";
        primeNumbers[index] = i;
        index++;
      }
    }

    for (int number : primeNumbers) {
      System.out.print(number + " ");
    }
  }
}