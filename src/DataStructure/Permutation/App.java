package DataStructure.Permutation;

class Permutation {
  public <T> void swap(T[] elements, int a, int b) {
    T temp = elements[a];
    elements[a] = elements[b];
    elements[b] = temp;
  }

  public <T> void printAllRecursive(int n, T[] elements) {
    if (elements.length == 1) {
      
    } else {
      for (int i = 0; i < (n - 1); i++) {
        printAllRecursive(n - 1, elements);
        if(n % 2 == 0) {
          swap(elements, i, n - 1);
        } else {
          swap(elements, 0, n - 1);
        }
      }
      printAllRecursive(n - 1, elements);
    }
  }

  public void printArray(T[] elements, char delimiter) {
    
  }
  
  // public void getPermulation(int[] numbers) {
  //   for (int i = 0; i < numbers.length; i++) {
  //     System.out.print('[');
  //     for(int j = 0; j < numbers.length; j++) {
  //       System.out.print(numbers[i] + ", ");
  //     }
  //     if(numbers.length > 0) {
  //       System.out.print(numbers[numbers.length - 1]);
  //     }
  //     System.out.println("]");
  //   }
  // }
}

public class App {
  public static void main(String[] args) {
    Permutation obj = new Permutation();
    char[] arr = {'a', 'b', 'c'};
    obj.printArray(arr.length, arr, ' ');
  }
}
