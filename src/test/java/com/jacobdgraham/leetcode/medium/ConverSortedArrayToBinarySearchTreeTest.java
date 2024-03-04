package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.utils.TreeNode;

public class ConverSortedArrayToBinarySearchTreeTest {

    final ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();
     
    @Test
    void testSortedArrayToBST() {
        // Example test case from the problem description
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-10);
        expected.left.right = new TreeNode(-3);
        expected.right = new TreeNode(5);
        expected.right.right = new TreeNode(9);

        TreeNode result = solution.sortedArrayToBST(nums);
        assertTrue(isSameTree(expected, result));
    }

    @Test
    void testSortedArrayToBST_EmptyArray() {
        int[] nums = {};
        TreeNode result = solution.sortedArrayToBST(nums);
        assertNull(result);
    }

    @Test
    void testSortedArrayToBST_NullArray() {
        int[] nums = null;
        TreeNode result = solution.sortedArrayToBST(nums);
        assertNull(result);
    }

    @Test
    void testSortedArrayToBST_SingleElement() {
        int[] nums = {5};
        TreeNode expected = new TreeNode(5);
        TreeNode result = solution.sortedArrayToBST(nums);
        assertTrue(isSameTree(expected, result));
    }

    // Helper method to check if two binary trees are identical
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
