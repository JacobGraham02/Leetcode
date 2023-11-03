package com.jacobdgraham.codesignal.InterviewPractice.LinkedLists;

public class SinglyLinkedListNode<T> {
  public SinglyLinkedListNode(T x) {
    value = x;
  }
  private T value;
  public T getValue() {
    return value;
  }
  public SinglyLinkedListNode<T> next;
}

