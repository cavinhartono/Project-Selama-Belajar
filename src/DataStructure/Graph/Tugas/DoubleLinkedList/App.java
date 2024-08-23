package DataStructure.Graph.Tugas.DoubleLinkedList;

import java.util.*;

class Graph {
  class Node {
    List<Integer> Neighbors;
    int vertex;
    Node prev;
    Node next;

    Node(int v) {
      vertex = v;
      Neighbors = new LinkedList<>();
      prev = next = null;
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
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }

      temp.next = newNode;
      newNode.prev = temp;
    }
  }

  public void insertEdge(int v, int w) {
    Node vNode = findNode(v);
    Node wNode = findNode(w);

    if (vNode != null && wNode != null) {
      vNode.Neighbors.add(w);
      wNode.Neighbors.add(v);
    }
  }

  private Node findNode(int v) {
    Node temp = head;
    while (temp != null) {
      if (temp.vertex == v) {
        return temp;
      }
      temp = temp.next;
    }

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