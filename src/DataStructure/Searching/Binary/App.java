package DataStructure.Searching.Binary;

public class App {
  public static void main(String[] args) {
    int[] Numbers = { 14, 2, 27, 18, 8 };
    int result = binary(Numbers, 8);

    System.out.println(result != -1
        ? ("Target tersebut ditemukan ke " + result)
        : ("Tidak ditemukan."));
  }

  public static int binary(int[] Arr, int target) {
    int low = 0, high = Arr.length - 1;

    while (low <= high) {
      int middle = low + (high - low) / 2;

      if (Arr[middle] == target) {
        return middle;
      }

      if (Arr[middle] < target) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }

    return -1;
  }
}
