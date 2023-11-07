package com.jacobdgraham.codesignal.InterviewPractice.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.RemoveKFromList;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.SinglyLinkedListNode;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils.LinkedListsEqual;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils.LinkedLists;

public class RemoveKFromListTest {
    
    private static RemoveKFromList removeKFromList;
    private static LinkedLists linkedLists;

    @BeforeAll
    final static void setUp() {
        removeKFromList = new RemoveKFromList<>();
        linkedLists = new LinkedLists();
    }    

    @Test
    final void testOnRegularLinkedList() {
        final SinglyLinkedListNode<Integer> singlyLinkedListNodes = linkedLists.buildRegularLinkedList();
        final SinglyLinkedListNode<Integer> singlyLinkedListResult = linkedLists.buildExpectedLinkedListResult();
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
