package com.jacobdgraham.leetcode.easy;

import com.jacobdgraham.leetcode.easy.ListNode;

/**
 * You are given the heads of two sorted linked lists 'list1' and 'list2'\
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists
 * Return the head of the merged linked list
 * 
 * Example 1:
 *  Input: list1=[1,2,4], list2=[1,3,4]
 *  Output: [1,1,2,3,4,4]
 * 
 * Example 2:
 *  Input: list1 = [], list2 = []
 *  Output: []
 * 
 * Example 3:
 *  Input: list1=[], list2=[0]
 *  Output: [0]
 */
public final class MergeTwoSortedLists {
    
    /**
     * You are given the heads of two sorted linked lists 'list1' and 'list2'\
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists
     * Return the head of the merged linked list
     * 
     * Example 1:
     *  Input: list1=[1,2,4], list2=[1,3,4]
     *  Output: [1,1,2,3,4,4]
     * 
     * Example 2:
     *  Input: list1 = [], list2 = []
     *  Output: []
     * 
     * Example 3:
     *  Input: list1=[], list2=[0]
     *  Output: [0]
     */
    public final ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode initial_merged_lists = new ListNode(0);
        ListNode merged_list_pointer = initial_merged_lists;
        ListNode list1_local_copy = list1;
        ListNode list2_local_copy = list2;

        while (list1_local_copy != null && list2_local_copy != null) {
            if (list1_local_copy.val <= list2_local_copy.val) {
                merged_list_pointer.next = list1_local_copy;
                list1_local_copy = list1_local_copy.next;
            } else {
                merged_list_pointer.next = list2_local_copy;
                list2_local_copy = list2_local_copy.next;
            }
            merged_list_pointer = merged_list_pointer.next;
        }

        if (list1_local_copy != null) {
            merged_list_pointer.next = list1_local_copy;
        } else if (list2_local_copy != null) {
            merged_list_pointer.next = list2_local_copy;
        }

        return initial_merged_lists.next;
    }
}
