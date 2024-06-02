package BinaryTreeExams;

public class BinaryTree {
  Node root;

  public void add(char value) {
    root = addRecursive(root, value);
  }

  public Node addRecursive(Node current, char value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < current.value) {
      current.left = addRecursive(current.left, value);
    } else if (value > current.value) {
      current.right = addRecursive(current.right, value);
    }

    return current;
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
      print(node.left, prefix + (isLeft ? "│   " : "    "), true);
      print(node.right, prefix + (isLeft ? "│   " : "    "), false);
    }
  }
}
