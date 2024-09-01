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

  public void deleteVertex(int v) {
    Node temp = head, prev = null;

    if (head == null) {
      return;
    }

    if (temp != null && temp.vertex == v) {
      last.next = head.next;
      head = head.next;
    } else {
      do {
        prev = temp;
        temp = temp.next;
      } while (temp != head && temp.vertex != v);

      if (temp == head) {
        return;
      }

      prev.next = temp.next;

      if (temp == last) {
        last = prev;
      }
    }

    for (int neighbor : temp.Neighbors) {
      Node node = findNode(neighbor);
      if (node != null) {
        node.Neighbors.remove((Integer) v);
      }
    }
  }

  public void deleteEdge(int v, int w) {
    Node vNode = findNode(v), wNode = findNode(w);
    if (vNode != null && wNode != null) {
      vNode.Neighbors.remove((Integer) w);
      wNode.Neighbors.remove((Integer) v);
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

  public void display() {
    Node temp = head;

    if (head == null) {
      return;
    }

    do {
      System.out.print("Vertex " + temp.vertex + " is connected to: ");
      for (int neighbor : temp.Neighbors)
        System.out.print(neighbor + " ");
      System.out.println();
      temp = temp.next;
    } while (temp != head);
  }
}

class App {
  public static void main(String[] args) {
    Graph graph = new Graph();

    System.out.println("\n Inserted Vertex");
    graph.insertVertex(1);
    graph.insertVertex(2);
    graph.insertVertex(3);

    graph.insertEdge(1, 2);
    graph.insertEdge(2, 3);
    graph.display();

    System.out.println("\nAfter Delete Vertex");
    graph.deleteVertex(1);
    graph.display();
  }
}
