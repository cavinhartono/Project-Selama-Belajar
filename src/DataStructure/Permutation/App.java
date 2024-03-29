package DataStructure.Permutation;

class Permutation {
  public void getPermulation(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.print('[');
      for(int j = 0; j < numbers.length; j++) {
        System.out.print(numbers[i] + ", ");
      }
      if(numbers.length > 0) {
        System.out.print(numbers[numbers.length - 1]);
      }
      System.out.println("]");
    }
  }
}

public class App {
  public static void main(String[] args) {
    
  }
}
