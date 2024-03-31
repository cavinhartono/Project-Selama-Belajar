package DataStructure.Pangkat;

public class App {
  public static void main(String[] args) {
    System.out.println(withLoop(5, 3));
    System.out.println(withRecursive(5, 3));
  }

  public static int withRecursive(int x, int n) {
    return n != 0 
            ? x * withRecursive(x, n - 1) 
            : 1;
  }

  public static int withLoop(int x, int n) {
    int result = 1;

    for (int i = 0; i < n; i++) {
      result *= x;
    }

    return result;
  }
}
