package com.jacobdgraham.leetcode.medium;

import com.jacobdgraham.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree solution = new BalancedBinaryTree();

    @Test
    void testBalancedBinaryTree_NullTree() {
        assertTrue(solution.isBalanced(null));
    }

    @Test
    void testBalancedBinaryTree_SingleNode() {
        TreeNode root = new TreeNode(1);
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void testBalancedBinaryTree_UnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        assertFalse(solution.isBalanced(root));
    }

    @Test
    void testBalancedBinaryTree_BalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        assertTrue(solution.isBalanced(root));
    }

    @Test
    void testBalancedBinaryTree_LargeBalancedTree() {
        // Construct a large balanced binary tree
        TreeNode root = constructBalancedTree(1, 1000);
        assertTrue(solution.isBalanced(root));
    }

    private TreeNode constructBalancedTree(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(mid);
        node.left = constructBalancedTree(start, mid - 1);
        node.right = constructBalancedTree(mid + 1, end);
        return node;
    }
}
