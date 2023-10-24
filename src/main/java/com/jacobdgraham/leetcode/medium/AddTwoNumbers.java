package com.jacobdgraham.leetcode.medium;

import com.jacobdgraham.leetcode.utils.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contain a single digit.
 * Add the two numbers and return the sum as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example 1:
 *  Input: l1 = [2,4,3], l2 = [5,6,4]
 *  Output: [7,0,8]
 *  Explanation: 342 + 465 = 807
 * 
 * Example 2:
 *  Input l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 *  Output: [8,9,9,9,0,0,0,1]
 * 
 * 
 * Constraints:
 *  The number of nodes in each linked list is in the range [1, 100]
 *  0 <= Node.val <= 9
 *  It is guaranteed that the list represents a number that does not have leading zeroes
 * 
 * 
 * Strategy to solving this:
 *  Bruteforce:
 *      1. First, we have to iterate through the ListNode's l1 and l2. While we are iterating over each node within l1 and l2, we must save the addition result of the 
 *      integers stored in l1 and l2 into a variable called sum. If either l1 or l2 does not have a value, set them to 0. 
 *      2. After we have stored the addition result in a variable, we must insert the variable value into a new linked list. 
 *        i. If the addition result is equal to or larger than 10, we must reduce that value down to one digit. If, for example, the value is 69, we must reduce to 6. 
 *        ii. We must calculate the unit digit (one's column) of sum by using the modulus operator with 10. 
 *        iii. Update a carry variable by dividing sum by 10 and taking the integer division part. 
 *      3. Create a new linked list node with the calculated digit as the value
 *      4. Create a new node for the tail of the linked list and attach that pointer to the newly created node
 *      5. Move to the next nodes in l1 and l2, if they exist. 
 */
public final class AddTwoNumbers {
    public final ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result_linked_list = new ListNode(0);
        ListNode result_linked_list_tail = result_linked_list;
        int carry_digit = 0;
        int list1_digit = 0;
        int list2_digit = 0;
        int total_node_integer_sum = 0;
        int total_node_integer_sum_ones_column = 0;

        // While the ListNode linked list for l1 and l2 are not empty, and there is no remaining carry value to add to the linked list
        while (l1 != null || l2 != null || carry_digit != 0) {
            if (l1 != null) {
                list1_digit = l1.val;
            } else {
                list1_digit = 0;
            }

            if (l2 != null) {
                list2_digit = l2.val;
            } else {
                list2_digit = 0;
            }
            // Get the total integer sum of the node retrieved from both l1 and l2.
            total_node_integer_sum = list1_digit + list2_digit + carry_digit;
            /* 
            * Assuming the integer sum of node values is 2 digits, we must modulo the integer sum by 10 to retrieve the value from the ones column. This will be used when we store
            * the value in the resulting linked list. 
            */
            total_node_integer_sum_ones_column = total_node_integer_sum % 10;
            /*
             * If we have a value that is greater than 10, we must divide that value by 10 to retrieve the value we will carry over to the next iteration of our loop
             */
            carry_digit = total_node_integer_sum / 10;

            ListNode new_integer_node_result = new ListNode(total_node_integer_sum_ones_column);
            result_linked_list_tail.next = new_integer_node_result;
            result_linked_list_tail = result_linked_list_tail.next;
            
            if (l1 != null) {
                l1 = l1.next;
            } else {
                l1 = null;
            }

            if (l2 != null) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
        }

        /**
         * Even though result_linked_list_tail is the ListNode which holds all of the nodes we are interested in, result_linked_list is the beginning of that NodeList, starting at
         * 0. Therefore, if we return result_linked_list.next, we will skip the 0 value and instead return each of the nodes placed into the linked list. 
         */
        return result_linked_list.next;
    }
}
