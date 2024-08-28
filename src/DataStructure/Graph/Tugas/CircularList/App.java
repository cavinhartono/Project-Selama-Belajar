package DataStructure.Graph.Tugas.CircularList;

import java.util.*;

class Graph {
  class Node {
    int vertex;
    Node next;
    List<Integer> Neighbors;

    Node(int v) {
      vertex = v;
      next = null;
      Neighbors = new LinkedList<>();
    }
  }

  private Node head;

  public Graph() {
    head = null;
  }

  public void insertVertex(int v) {
    Node newNode = new Node(v);

    if (head == null) {
      head = newNode;
      newNode.next = head;
    } else {
      Node temp = head;
      while (temp.next != head) {
        temp = temp.next;
      }
      temp.next = newNode;
      newNode.next = head;
    }
  }

  public void insertEdge(int v, int w) {
    Node vNode = findNode(v), wNode = findNode(w);

    if (vNode != null && vNode != null) {
      vNode.Neighbors.add(w);
      wNode.Neighbors.add(v);
    }
  }

  public Node findNode(int v) {
    Node temp = head;
    if (temp == null) {
      return null;
    }

    do {
      if (temp.vertex == v) {
        return temp;
      }

      temp = temp.next;
    } while (temp != null);

    return null;
  }

  public void display() {
    Node temp = head;

    if (head == null) {
      return;
    }

    do {
      System.out.print("Vertex " + temp.vertex + " is connected to: ");
      for (int neighbor : temp.Neighbors) {
        System.out.print(neighbor + " ");
      }
      System.out.println();
      temp = temp.next;
    } while (temp != head);
  }
}

class App {
  public static void main(String[] args) {
    Graph graph = new Graph();

    graph.insertVertex(1);
    graph.insertVertex(2);
    graph.insertVertex(3);

    graph.insertEdge(1, 2);
    graph.insertEdge(2, 3);

    graph.display();
  }
}
