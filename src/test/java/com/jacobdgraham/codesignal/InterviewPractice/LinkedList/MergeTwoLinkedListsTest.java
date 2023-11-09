package com.jacobdgraham.codesignal.InterviewPractice.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils.LinkedLists;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.MergeTwoLinkedLists;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.SinglyLinkedListNode;

public class MergeTwoLinkedListsTest {
    
    private static MergeTwoLinkedLists mergeTwoLinkedLists;
    private static SinglyLinkedListNode singlyLinkedListNodeMergeOne;
    private static SinglyLinkedListNode singlyLinkedListNodeMergeTwo;

    @BeforeAll
    static final void setUp() {
        mergeTwoLinkedLists = new MergeTwoLinkedLists();
        singlyLinkedListNodeMergeOne = buildLinkedListMergeOne();
        singlyLinkedListNodeMergeTwo = buildLinkedListMergeTwo();
    }

    public static final SinglyLinkedListNode<Integer> buildLinkedListMergeOne() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(1);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(3);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(5);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(7);
        SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode<>(9);
        SinglyLinkedListNode<Integer> node6 = new SinglyLinkedListNode<>(11);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        return node1;
    }

    public static final SinglyLinkedListNode<Integer> buildLinkedListMergeTwo() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(2);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(4);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(6);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(8);
        SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode<>(10);
        SinglyLinkedListNode<Integer> node6 = new SinglyLinkedListNode<>(12);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        return node1;
    }

     public static final SinglyLinkedListNode<Integer> buildLinkedListMerged() {
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode<>(1);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode<>(2);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode<>(3);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode<>(4);
        SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode<>(5);
        SinglyLinkedListNode<Integer> node6 = new SinglyLinkedListNode<>(6);
        SinglyLinkedListNode<Integer> node7 = new SinglyLinkedListNode<>(7);
        SinglyLinkedListNode<Integer> node8 = new SinglyLinkedListNode<>(8);
        SinglyLinkedListNode<Integer> node9 = new SinglyLinkedListNode<>(9);
        SinglyLinkedListNode<Integer> node10 = new SinglyLinkedListNode<>(10);
        SinglyLinkedListNode<Integer> node11 = new SinglyLinkedListNode<>(11);
        SinglyLinkedListNode<Integer> node12 = new SinglyLinkedListNode<>(12);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;

        return node1;
    }


    @Test
    final void testMergeTwoRegularLinkedLists() {
        SinglyLinkedListNode<Integer> expectedResult = buildLinkedListMerged();
        SinglyLinkedListNode<Integer> actualResult = mergeTwoLinkedLists.solution(singlyLinkedListNodeMergeOne, singlyLinkedListNodeMergeTwo);

        while (expectedResult != null && actualResult != null) {
            assertEquals(expectedResult.getValue(), actualResult.getValue());
            expectedResult = expectedResult.next;
            actualResult = actualResult.next;
        }
        
        // Make sure both lists are now null
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testReturnNullOnNullList() {
        SinglyLinkedListNode<Integer> expectedResultListOne = null;
        SinglyLinkedListNode<Integer> expectedResultListTwo = null;
        SinglyLinkedListNode<Integer> actualResult = mergeTwoLinkedLists.solution(expectedResultListOne, singlyLinkedListNodeMergeTwo);
        assertEquals(expectedResultListOne, actualResult);
        actualResult = mergeTwoLinkedLists.solution(singlyLinkedListNodeMergeOne, expectedResultListTwo);
        assertEquals(expectedResultListTwo, actualResult);
    }

    @AfterAll
    final static void tearDown() {
        mergeTwoLinkedLists = null;
        singlyLinkedListNodeMergeOne = null;
        singlyLinkedListNodeMergeTwo = null;
    }
}
