package com.jacobdgraham.codesignal.InterviewPractice.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.RemoveKFromList;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.SinglyLinkedListNode;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils.LinkedListsEqual;

public class removeKFromListTest {
    
    private static RemoveKFromList removeKFromList;

    @BeforeAll
    final static void setUp() {
        removeKFromList = new RemoveKFromList<>();
    }    

    private final SinglyLinkedListNode<Integer> buildRegularLinkedList() {
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

    private final SinglyLinkedListNode<Integer> buildExpectedLinkedListResult() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(1);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(2);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(4);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    @Test
    final void testOnRegularLinkedList() {
        final SinglyLinkedListNode<Integer> singlyLinkedListNodes = buildRegularLinkedList();
        final SinglyLinkedListNode<Integer> singlyLinkedListResult = buildExpectedLinkedListResult();
        final SinglyLinkedListNode<Integer> actualResult = removeKFromList.solution(singlyLinkedListNodes, 3);
        assertTrue(LinkedListsEqual.areLinkedListsEqual(singlyLinkedListResult, actualResult));
    }

    @Test
    final void testOnNullLinkedList() {
        final SinglyLinkedListNode<Integer> singlyLinkedListNode = null;
        final SinglyLinkedListNode<Integer> singlyLinkedListResult = null;
        final SinglyLinkedListNode<Integer> actualResult = removeKFromList.solution(singlyLinkedListNode, 3);
        assertEquals(singlyLinkedListResult, actualResult); 
    }

    @AfterAll
    final static void tearDown() {
        removeKFromList = null;
    }
}
