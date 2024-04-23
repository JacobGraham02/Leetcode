package com.jacobdgraham.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.LinkedListCycle;
import com.jacobdgraham.leetcode.utils.ListNode;

/**
Example 1:
    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:
    Input: head = [1,2], pos = 0
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:
    Input: head = [1], pos = -1
    Output: false
    Explanation: There is no cycle in the linked list.
 */
public final class LinkedListCycleTest {
    
    private static LinkedListCycle linkedListCycle;

    @BeforeAll
    final static void setUp() {
        linkedListCycle = new LinkedListCycle();
    }

    @Test
    final void testLinkedListCycleRegularList() {
        final int treeNodeRootValue = 3;
        final ListNode root = new ListNode(treeNodeRootValue);

        final ListNode node1 = new ListNode(3);
        final ListNode node2 = new ListNode(2);
        final ListNode node3 = new ListNode(0);
        final ListNode node4 = new ListNode(-4);
        
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        boolean actualResult = linkedListCycle.hasCycle(root);

        assertTrue(actualResult);
    }

    @Test
    final void testLinkedListNoCycle() {
        final int treeNodeRootValue = 3;
        final ListNode root = new ListNode(treeNodeRootValue);

        final ListNode node1 = new ListNode(3);
        final ListNode node2 = new ListNode(2);
        final ListNode node3 = new ListNode(0);
        final ListNode node4 = new ListNode(-4);
        
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        boolean actualResult = linkedListCycle.hasCycle(root);

        assertFalse(actualResult);
    }

    @AfterAll
    final static void tearDown() {
        linkedListCycle = null;
    }
}
