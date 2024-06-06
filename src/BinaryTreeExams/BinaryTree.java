package BinaryTreeExams;

public class BinaryTree { // untuk membuat pohon biner
  Node root; // Referensi ke akar pohon biner

  public void add(char value) {
    root = addRecursive(root, value);
  } /*
     * Menambahkan nilai ke dalam pohon biner dengan memanggil metode rekursif
     * `addRecursive`
     */

  public Node addRecursive(Node current, char value) {
    if (current == null) {
      return new Node(value);
    } // Jika current adalah null, buat simpul baru dengan nilai value.

    if (value < current.value) {
      current.left = addRecursive(current.left, value);
      /*
       * Jika value lebih kecil dari current.value, tambahkan nilai ke anak kiri
       * secara rekursif.
       */
    } else if (value > current.value) {
      current.right = addRecursive(current.right, value);
      /*
       * Jika value lebih besar dari current.value, tambahkan nilai ke anak kanan
       * secara rekursif.
       */
    }

    return current; // Kembalikan `current` untuk mengupdate referensi dalam pohon
  }

  public void inOrder(Node node) {
    if (node != null) {
      inOrder(node.left);
      System.out.print(node.value + "(" + (int) node.value + ") ");
      inOrder(node.right);
    }
  }

  public void preOrder(Node node) {
    if (node != null) {
      System.out.print(node.value + "(" + (int) node.value + ") ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public void postOrder(Node node) {
    if (node != null) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.value + "(" + (int) node.value + ") ");
    }
  }

  public void print(Node node, String prefix, boolean isLeft) {
    if (node != null) {
      System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.value);
      print(node.left, prefix + (isLeft ? "│ " : " "), true);
      print(node.right, prefix + (isLeft ? "│ " : " "), false);
    }
  }
}
