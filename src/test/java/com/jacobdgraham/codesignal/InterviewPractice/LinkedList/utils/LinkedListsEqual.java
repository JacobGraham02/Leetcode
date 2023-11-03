package com.jacobdgraham.codesignal.InterviewPractice.LinkedList.utils;

import com.jacobdgraham.codesignal.InterviewPractice.LinkedLists.SinglyLinkedListNode;

public class LinkedListsEqual {
    
    public static boolean areLinkedListsEqual(SinglyLinkedListNode<Integer> list1, SinglyLinkedListNode<Integer> list2) {
        while (list1 != null && list2 != null) {
            if (!list1.getValue().equals(list2.getValue())) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        // If both lists reach the end at the same time, they are equal
        return list1 == null && list2 == null;
    }
}
