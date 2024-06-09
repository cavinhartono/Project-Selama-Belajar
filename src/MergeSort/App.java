package MergeSort;

public class App {
  public static void main(String[] args) {
    String[] Students = { "55", "32", "31", "1", "43" };

    MergeSort obj = new MergeSort();

    System.out.print("Sebelum pengurutan: ");
    obj.print(Students);

    obj.sort(Students, 0, Students.length - 1);

    System.out.print("Setelah pengurutan: ");
    obj.print(Students);
  }
}
