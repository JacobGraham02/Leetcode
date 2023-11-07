package com.jacobdgraham.codesignal.InterviewPractice.LinkedLists;

import com.jacobdgraham.leetcode.utils.ListNode;

/**
 * Given a singly linked list of integers, determine whether or not it's a palindrome.

Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization: in real data you will be given a head node l of the linked list

Example

    For l = [0, 1, 0], the output should be
    solution(l) = true;

    For l = [1, 2, 2, 3], the output should be
    solution(l) = false.

 */
public final class IsListPalindrome {
    
    /**
     * Given a singly linked list of integers, determine whether or not it's a palindrome.

Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization: in real data you will be given a head node l of the linked list

Example

    For l = [0, 1, 0], the output should be
    solution(l) = true;

    For l = [1, 2, 2, 3], the output should be
    solution(l) = false.

     * @param singlyLinkedListNode a SinglyLinkedListNode instance with an Integer type parameter
     * @return boolean value indicating if the list is a palindrome solution
     */
    public final boolean solution(SinglyLinkedListNode<Integer> l) {
        if (l == null || l.next == null) {
            return true;
        }

        SinglyLinkedListNode<Integer> secondHalfOfList = l;
        SinglyLinkedListNode<Integer> firstHalfOfList = l;

        /*
        The pointer secondHalfOfList will move twice as slowly as firstHalfOfList.
        When firstHalfOfList reaches the end node in the linked list, secondHalfOfList will be at the middle point.
        */
        while (firstHalfOfList != null && firstHalfOfList.next != null) {
            secondHalfOfList = secondHalfOfList.next;
            firstHalfOfList = firstHalfOfList.next.next;
        }

        SinglyLinkedListNode<Integer> secondHalfOfReversedList = reverseLinkedList(secondHalfOfList);
        SinglyLinkedListNode<Integer> originalSecondHalf = secondHalfOfReversedList; // Create a copy of the reversed second half

        while (originalSecondHalf != null) {
            if (!l.getValue().equals(originalSecondHalf.getValue())) {
                return false;
            }
            l = l.next;
            originalSecondHalf = originalSecondHalf.next;
        }
        return true;
    }

    private final SinglyLinkedListNode<Integer> reverseLinkedList(SinglyLinkedListNode<Integer> head) {
        SinglyLinkedListNode<Integer> previousListNode = null;
        SinglyLinkedListNode<Integer> currentListNode = head;

        while (currentListNode != null) {
            SinglyLinkedListNode<Integer> nextNodeForPreviousList = currentListNode.next;
            currentListNode.next = previousListNode;
            previousListNode = currentListNode;
            currentListNode = nextNodeForPreviousList;
        }
        return previousListNode;
    }
}
