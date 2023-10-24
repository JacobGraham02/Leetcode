package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.utils.ListNode;

final public class AddTwoNumbersTest {

    final AddTwoNumbers addTwoNumbersInstance = new AddTwoNumbers();
    
    @Test
    public final void testAddTwoNumbersNormalLinkedLists() {
        final ListNode linked_list_one = new ListNode(2);
        linked_list_one.next = new ListNode(4);
        linked_list_one.next.next = new ListNode(3);

        final ListNode linked_list_two = new ListNode(5);
        linked_list_two.next = new ListNode(6);
        linked_list_two.next.next = new ListNode(4);

        final ListNode resulting_linked_list = new ListNode(7);
        resulting_linked_list.next = new ListNode(0);
        resulting_linked_list.next.next = new ListNode(8);

        final ListNode addTwoNumbers_result = addTwoNumbersInstance.addTwoNumbers(linked_list_one, linked_list_two);
        System.out.println(addTwoNumbers_result);
        System.out.println(resulting_linked_list);
        assertEquals(resulting_linked_list.toString(), addTwoNumbers_result.toString());
    }

    @Test
    public final void testAddTwoNumbersAllNinesLinkedLists() {
        final ListNode linked_list_one = new ListNode(9);
        linked_list_one.next = new ListNode(9);
        linked_list_one.next.next = new ListNode(9);
        linked_list_one.next.next.next = new ListNode(9);
        linked_list_one.next.next.next.next = new ListNode(9);
        linked_list_one.next.next.next.next.next = new ListNode(9);
        linked_list_one.next.next.next.next.next.next = new ListNode(9);

        final ListNode linked_list_two = new ListNode(9);
        linked_list_two.next = new ListNode(9);
        linked_list_two.next.next = new ListNode(9);
        linked_list_two.next.next.next = new ListNode(9);

        final ListNode resulting_linked_list = new ListNode(8);
        resulting_linked_list.next = new ListNode(9);
        resulting_linked_list.next.next = new ListNode(9);
        resulting_linked_list.next.next.next = new ListNode(9);
        resulting_linked_list.next.next.next.next = new ListNode(0);
        resulting_linked_list.next.next.next.next.next = new ListNode(0);
        resulting_linked_list.next.next.next.next.next.next = new ListNode(0);
        resulting_linked_list.next.next.next.next.next.next.next = new ListNode(1);

        final ListNode addTwoNumbers_result = addTwoNumbersInstance.addTwoNumbers(linked_list_one, linked_list_two);
        System.out.println(addTwoNumbers_result);
        System.out.println(resulting_linked_list);
        assertEquals(resulting_linked_list.toString(), addTwoNumbers_result.toString());
    }

    @Test
    public final void testAddTwoNumbersAllZeroesLinkedList() {
        final ListNode linked_list_one = new ListNode(0);

        final ListNode linked_list_two = new ListNode(0);

        final ListNode resulting_linked_list = new ListNode(0);

        final ListNode addTwoNumbers_result = addTwoNumbersInstance.addTwoNumbers(linked_list_one, linked_list_two);
        System.out.println(addTwoNumbers_result);
        System.out.println(resulting_linked_list);
        assertEquals(resulting_linked_list.toString(), addTwoNumbers_result.toString());
    }
}
