package DataStructure.Sorting.Shell;

class App {
  static int shellSort(int Arr[]) {
    int n = Arr.length;

    for (int gap = n / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < n; i++) {
        int j, temp = Arr[i];
        for (j = i; ((j >= gap) && (Arr[j - gap] > temp)); j -= gap) {
          Arr[j] = Arr[j - gap];
        }

        Arr[j] = temp;
      }
    }

    return 0;
  }

  public static void main(String args[]) {
    int[] Numbers = { 64, 23, 42, 39, 51, 12 };
    shellSort(Numbers);

    for (int number : Numbers) {
      System.out.print(number + " ");
    }
  }
}
