package com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils;

import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.SinglyLinkedListNode;

public final class LinkedLists {
    
    public static final SinglyLinkedListNode<Integer> buildRegularLinkedList() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(3);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(1);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(2);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(3);
        SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode<>(4);
        SinglyLinkedListNode<Integer> node6 = new SinglyLinkedListNode<>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        return node1;
    }

    public static final SinglyLinkedListNode<Integer> buildExpectedLinkedListResult() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(1);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(2);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(4);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    public static final SinglyLinkedListNode<Integer> palindromeLinkedListResult() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(77);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(1000000000);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(1000000000);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(77);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }
}
