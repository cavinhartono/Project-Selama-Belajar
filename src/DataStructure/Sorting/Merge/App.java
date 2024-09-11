package DataStructure.Sorting.Merge;

class Merge {
  public static void sort(int[] Numbers) {
  }

  public static void merge(int[] Arr, int l, int m, int r) {
    int n1 = m - l + 1, n2 = r - m;

    int[] L = new int[n1], R = new int[n2];
    for (int i = 0; i < n1; i++) {
      L[i] = Arr[i + 1];
    }

    for (int j = 0; j < n2; j++) {
      R[j] = Arr[m + 1 + j];
    }
  }

  public static void main(String[] args) {
    int[] Numbers = { 24, 12, 8, 21, 42 };
  }
}