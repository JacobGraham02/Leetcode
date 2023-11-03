package com.jacobdgraham.codesignal.InterviewPractice.LinkedLists;

public final class RemoveKFromList<T> {
    
    public final SinglyLinkedListNode<Integer> solution(SinglyLinkedListNode<Integer> l, int k) {
        if (l == null) {
            return null;
        }
        SinglyLinkedListNode<Integer> SinglyLinkedListNodeHead = l;
        SinglyLinkedListNode<Integer> previousSinglyLinkedListNodeHead = null;
        
        while (l != null && l.getValue() == k) {
            l = l.next;
        }
        
        while (SinglyLinkedListNodeHead != null) {
            if (SinglyLinkedListNodeHead.getValue() == k) {
                if (previousSinglyLinkedListNodeHead != null) {
                    previousSinglyLinkedListNodeHead.next = SinglyLinkedListNodeHead.next;
                }
            } else {
                previousSinglyLinkedListNodeHead = SinglyLinkedListNodeHead;
            }
            SinglyLinkedListNodeHead = SinglyLinkedListNodeHead.next;
        }
        return l;
    }
}
