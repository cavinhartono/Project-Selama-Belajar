package MergeSort;

public class MergeSort {
  public void sort(String[] Arr, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      sort(Arr, left, middle);
      sort(Arr, middle + 1, right);
      mergeSort(Arr, left, middle, right, 'a');
    }
  }

  public void mergeSort(String[] Arr, int left, int middle, int right, char choice) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    String[] Left = new String[n1];
    String[] Right = new String[n2];

    for (int i = 0; i < n1; ++i) {
      Left[i] = Arr[left + i];
    }

    for (int j = 0; j < n2; ++j) {
      Right[j] = Arr[middle + 1 + j];
    }

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
      switch (choice) {
        case 'a':
          if (Left[i].compareTo(Right[j]) <= 0) {
            Arr[k] = Left[i];
            i++;
          } else {
            Arr[k] = Right[j];
            j++;
          }
          break;
        case 'd':
          if (Left[i].compareTo(Right[j]) >= 0) {
            Arr[k] = Left[i];
            i++;
          } else {
            Arr[k] = Right[j];
            j++;
          }
        default:
          break;
      }
      k++;
    }

    while (i < n1) {
      Arr[k] = Left[i];
      i++;
      k++;
    }

    while (j < n2) {
      Arr[k] = Right[j];
      j++;
      k++;
    }
  }

  public void print(String[] Arr) {
    for (String item : Arr) {
      System.out.print(item + " ");
    }
    System.out.println();
  }
}