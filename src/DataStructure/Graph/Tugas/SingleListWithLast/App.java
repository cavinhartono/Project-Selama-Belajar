package DataStructure.Graph.Tugas.SingleListWithLast;

import java.util.*;

class Graph {
  class Node {
    int vertex;
    Node next;
    List<Integer> Neighbors;

    Node(int v) {
      vertex = v;
      Neighbors = new LinkedList<>();
      next = null;
    }
  }

  private Node head;
  private Node last;

  Graph() {
    head = last = null;
  }

  public Node findNode(int v) {
    Node temp = head;
    while (temp != null) {
      if (temp.vertex == v) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

  public void insertVertex(int v) {
    Node node = new Node(v);
    if (head == null) {
      head = last = null;
    } else {
      last.next = node;
      last = node;
    }
  }

  public void insertEdge(int v, int w) {
    Node vNode = findNode(v), wNode = findNode(w);
    if (vNode != null && wNode != null) {
      vNode.Neighbors.add(w);
      wNode.Neighbors.add(v);
    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print("Vertex " + temp.vertex + " is connected to: ");
      for (int neighbor : temp.Neighbors) {
        System.out.print(neighbor + " ");
      }
      System.out.println();
      temp = temp.next;
    }
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
