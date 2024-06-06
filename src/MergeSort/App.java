package MergeSort;

public class App {
  public static void main(String[] args) {
    String[] Students = { "Kevin", "Fahrezi", "Fauzi", "Cavin", "Bintang", "Daniel", "Ali", "Fiki" };

    System.out.print("Sebelum pengurutan: ");
    printArray(Students);

    mergeSort(Students, 0, Students.length - 1);

    System.out.print("Setelah pengurutan: ");
    printArray(Students);
  }

  public static void mergeSort(String[] arr, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      mergeSort(arr, left, middle);
      mergeSort(arr, middle + 1, right);
      merge(arr, left, middle, right);
    }
  }

  public static void merge(String[] arr, int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    String[] leftArray = new String[n1];
    String[] rightArray = new String[n2];

    for (int i = 0; i < n1; ++i) {
      leftArray[i] = arr[left + i];
    }
    for (int j = 0; j < n2; ++j) {
      rightArray[j] = arr[middle + 1 + j];
    }

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2) {
      if (leftArray[i].compareTo(rightArray[j]) <= 0) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }

  public static void printArray(String[] arr) {
    for (String item : arr) {
      System.out.print(item + " ");
    }
    System.out.println();
  }
}
