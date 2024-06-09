package DataStructure.BinaryTree;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

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

  public int maxLevel(Node node) {
    return node != null ? Math.max(maxLevel(node.left), maxLevel(node.right)) + 1 : 0;
  }

  public void nodeInternal(List<Node> nodes, int level, int maxLevel) {
    if (nodes.isEmpty() || isAllElementsNull(nodes)) {
      return;
    }

    int floor = maxLevel - level, lines = (int) Math.pow(2, (Math.max(floor - 1, 0))),
        firstSpaces = (int) Math.pow(2, (floor)) - 1, betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

    whitespaces(firstSpaces);

    List<Node> newNodes = new ArrayList<>();
    for (Node node : nodes) {
      if (node != null) {
        System.out.print(node.value);
        newNodes.add(node.left);
        newNodes.add(node.right);
      } else {
        System.out.print(" ");
        newNodes.add(null);
        newNodes.add(null);
      }
      whitespaces(betweenSpaces);
    }
    System.out.println();

    for (int i = 1; i < lines; i++) {
      for (int j = 0; j < nodes.size(); j++) {
        whitespaces(firstSpaces - i);
        if (nodes.get(j) == null) {
          whitespaces(lines + lines + i + 1);
          continue;
        }

        if (nodes.get(j).left != null) {
          System.out.print("/");
        } else {
          whitespaces(1);
        }

        whitespaces(i + i - 1);

        if (nodes.get(j).right != null) {
          System.out.print("\\");
        } else {
          whitespaces(1);
        }

        whitespaces(lines + lines - 1);
      }

      System.out.println();
    }

    nodeInternal(newNodes, level + 1, maxLevel);
  }

  public void print() {
    int maxLevel = maxLevel(root);
    nodeInternal(Collections.singletonList(root), 1, maxLevel);
  }

  public void whitespaces(int count) {
    for (int i = 0; i < count; i++) {
      System.out.print(" ");
    }
  }

  public boolean isAllElementsNull(List<Node> list) {
    for (Object object : list) {
      if (object != null) {
        return false;
      }
    }

    return true;
  }
}
