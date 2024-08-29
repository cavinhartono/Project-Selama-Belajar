package DataStructure.Graph.Tugas.DoubleListWithLast;

import java.util.*;

class Graph {
  class Node {
    int vertex;
    List<Integer> Neighbors;
    Node prev;
    Node next;

    Node(int v) {
      this.vertex = v;
      this.Neighbors = new LinkedList<>();
      prev = next = null;
    }
  }

  private Node head, last;

  Graph() {
    head = last = null;
  }

  public void insertVertex(int v) {
    Node node = new Node(v);

    if (head == null) {
      head = last = node;
    } else {
      last.next = node;
      node.next = last;
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

  public Node findNode(int v) {
    Node temp = head;

    if (head == null) {
      return null;
    }

    do {
      if (temp.vertex == v) {
        return temp;
      }
      temp = temp.next;
    } while (temp != head);

    return null;
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
