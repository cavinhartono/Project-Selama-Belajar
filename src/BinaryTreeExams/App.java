package BinaryTreeExams;

public class App {
  public static void main(String[] args) {
    BinaryTree obj = new BinaryTree();
    char[] Letters = { 'E', 'G', 'A', 'C', 'D', 'B', 'T', 'Y', 'Z', 'L', 'I', 'M' };

    for (char letter : Letters) {
      obj.add(letter);
    }

    System.out.println("Binary Tree: ");
    obj.print(obj.root, "", false);

    System.out.println("InOrder: ");
    obj.inOrder(obj.root);
    System.out.println();

    System.out.println("PreOrder: ");
    obj.preOrder(obj.root);
    System.out.println();

    System.out.println("PostOrder: ");
    obj.postOrder(obj.root);
    System.out.println();
  }
}