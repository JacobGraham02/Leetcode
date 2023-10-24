package com.jacobdgraham.leetcode.utils;

public final class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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