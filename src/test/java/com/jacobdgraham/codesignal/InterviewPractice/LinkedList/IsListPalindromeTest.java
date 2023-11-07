package com.jacobdgraham.codesignal.InterviewPractice.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils.LinkedLists;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.IsListPalindrome;
import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.SinglyLinkedListNode;

public class IsListPalindromeTest {
    
    private static IsListPalindrome isListPalindrome;
    private static LinkedLists linkedLists;
    private static SinglyLinkedListNode<Integer> singlyLinkedList;

    @BeforeAll
    static final void setUp() {
        isListPalindrome = new IsListPalindrome();
        linkedLists = new LinkedLists();
        singlyLinkedList = linkedLists.buildRegularLinkedList();
    }

    @Test
    final void testWithNullLinkedList() {
        singlyLinkedList = null;
        final boolean expectedResult = true;
        final boolean actualResult = isListPalindrome.solution(singlyLinkedList);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testWithEmptyLinkedList() {
        singlyLinkedList = new SinglyLinkedListNode<Integer>(null);
        final boolean expectedResult = true;
        final boolean actualResult = isListPalindrome.solution(singlyLinkedList);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testWithRegularLinkedList() {
        singlyLinkedList = linkedLists.palindromeLinkedListResult();
        final boolean expectedResult = true;
        final boolean actualResult = isListPalindrome.solution(singlyLinkedList);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    final void testWithLinkedListNotPalindrome() {
        singlyLinkedList = linkedLists.buildExpectedLinkedListResult();
        final boolean expectedResult = false;
        final boolean actualResult = isListPalindrome.solution(singlyLinkedList);
        assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    static final void tearDown() {
        isListPalindrome = null;
        singlyLinkedList = null;
        linkedLists = null;
    }
}
