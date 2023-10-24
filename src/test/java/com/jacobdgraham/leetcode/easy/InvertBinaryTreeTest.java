package com.jacobdgraham.leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.utils.TreeNode;

public class InvertBinaryTreeTest {
    
    private static InvertBinaryTree invertBinaryTree;

    @BeforeAll
    final static void setUp() {
        invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    final void testInvertEmptyBinaryTree() {
        final TreeNode empty_binary_tree = new TreeNode(0, null, null);
        final TreeNode expected_output = new TreeNode(0, null, null);
        final TreeNode actual_output = invertBinaryTree.invertTree(empty_binary_tree);
        assertAll("TreeNode Equality Check",
            () -> assertTreesEqual(expected_output, actual_output)
        );
    }

    private void assertTreesEqual(TreeNode expected, TreeNode actual) {
        if (expected == null && actual == null) {
            // Both nodes are null, they are equal
            return;
        }
        assertNotNull(expected, "Expected node should not be null");
        assertNotNull(actual, "Actual node should not be null");

        assertEquals(expected.val, actual.val, "Node values should be equal");

        // Recursively check left and right subtrees
        assertTreesEqual(expected.left, actual.left);
        assertTreesEqual(expected.right, actual.right);
    }

    @Test
    final void testInvertRegularBinaryTree() {
        final TreeNode node_1 = new TreeNode(1, null, null);
        final TreeNode node_2 = new TreeNode(3, null, null);
        final TreeNode binary_tree = new TreeNode(2, node_1, node_2);
        final TreeNode expected_output = new TreeNode(2, node_2, node_1);
        final TreeNode actual_output = invertBinaryTree.invertTree(binary_tree);
        assertAll("TreeNode Equality Check",
            () -> assertTreesEqual(expected_output, actual_output)
        );
    }

    @AfterAll
    final static void tearDown() {
        invertBinaryTree = null;
    }
}
