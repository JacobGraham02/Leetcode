package com.jacobdgraham.leetcode.medium;

public final class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            current = current.next;
            if (current != null) {
                sb.append("->");
            }
        }
        return sb.toString();
    }
}