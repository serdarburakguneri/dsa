package com.sbg.dsa.linkedlist;

public class Node {

  private int value;

  private Node next;

  public Node(int value) {
    this.value = value;
  }

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void print() {
    Node current = this;
    while (current != null) {
      System.out.print(current.getValue() + " ");
      current = current.getNext();
    }
    System.out.println();
  }
}
