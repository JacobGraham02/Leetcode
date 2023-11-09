package com.jacobdgraham.codesignal.InterviewPractice.LinkedLists;

public final class MergeTwoLinkedLists {
    
    public final SinglyLinkedListNode<Integer> solution(SinglyLinkedListNode<Integer> l1, SinglyLinkedListNode<Integer> l2) {
    /*
    If either list1 or list2 are null, return the corresponding list which is not null
    */
    if (l1 == null) {
        return null;
    }
    if (l2 == null) {
        return null;
    }

    /*
    Create a fake node which we can use to initially create a list. Create a separate list pointer which will be initialized with the fake node, and will be used to assign nodes.
    */
    SinglyLinkedListNode<Integer> sortedLinkedListDummy = new SinglyLinkedListNode(-1);
    SinglyLinkedListNode<Integer> current = sortedLinkedListDummy;
    
    while (l1 != null && l2 != null) {
        if (l1.getValue() <= l2.getValue()) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }
    
    /*
    If either l1 or l2 is null after iterating through each of them with the while loop, a list may have some elements remaining if both lists are not the same length. Therefore, we have to assign the corresponding list to the 'next' spot in our final result linked list.
    */
    if (l1 != null) {
        current.next = l1;
    } else {
        current.next = l2;
    }

    return sortedLinkedListDummy.next;
}

}
