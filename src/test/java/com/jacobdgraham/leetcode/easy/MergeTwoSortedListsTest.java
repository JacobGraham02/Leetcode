package com.jacobdgraham.leetcode.easy;

import com.jacobdgraham.leetcode.easy.ListNode;
import com.jacobdgraham.leetcode.easy.MergeTwoSortedLists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;

public class MergeTwoSortedListsTest {
    private static MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    void test_merge_two_empty_lists() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertNull(result);
    }

    @Test
    void test_merge_one_empty_list_and_one_non_empty_list() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(1);
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    void test_merge_two_sorted_lists() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next);
    }

    @AfterAll
    static void tearDown() {
        mergeTwoSortedLists = null;
    }
}
