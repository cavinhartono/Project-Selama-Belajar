package DataStructure.Graph.Tugas.CircularListWIthLast;

import java.util.*;

class Graph {
  class Node {
    int vertex;
    List<Integer> Neighbors;
    Node next;

    Node(int v) {
      this.vertex = v;
      this.Neighbors = new LinkedList<>();
      this.next = null;
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
      node.next = head;
    } else {
      last.next = node;
      node.next = head;
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
    if (head == null) {
      return null;
    }

    Node temp = head;
    do {
      if (temp.vertex == v) {
        return temp;
      }
      temp = temp.next;
    } while (temp != null);

    return null;
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
  }
}
