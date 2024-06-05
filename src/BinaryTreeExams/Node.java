package BinaryTreeExams;

public class Node { // Kita membuat kelas beri nama 'Node'
  char value; // Menyimpan nilai karakter pada simpul
  Node left, right; /*
                     * Referensi ke anak kiri dari simpul dan anak kanan dari simpul dengan
                     * // memanggil kelasnya sendiri
                     */

  public Node(char value) {
    this.value = value;
    left = right = null;
  } /*
     * Menginisialisasi simpul dengan nilai yang diberikan dan mengatur
     * anak kiri/kanan menjadi null
     */
}
