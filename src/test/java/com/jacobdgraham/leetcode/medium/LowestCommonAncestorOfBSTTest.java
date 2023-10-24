package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.utils.TreeNode;

/**
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

Input: root = [2,1], p = 2, q = 1
Output: 2
*/
public final class LowestCommonAncestorOfBSTTest {

    private static LowestCommonAncestorOfBST lowestCommonAncestorOfBST;

    @BeforeAll
    static void setUp() {
        lowestCommonAncestorOfBST = new LowestCommonAncestorOfBST();
    }

    @Test
    void testLowestCommonAncestorBSTRegularBinarySearchTree() {
        final int expectedNodeValue = 6;
        final TreeNode root = new TreeNode(expectedNodeValue);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        // Nodes to find LCA for
        final TreeNode p = new TreeNode(2);
        final TreeNode q = new TreeNode(8);

        final TreeNode result = lowestCommonAncestorOfBST.lowestCommonAncestorIterative(root, p, q);
        assertEquals(root, result);
    }

    @Test
    void testLowestCommonAncestorBSTTwoElementTree() {
        final int expectedNodeValue = 2;
        final TreeNode root = new TreeNode(expectedNodeValue);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        // Nodes to find LCA for
        final TreeNode p = new TreeNode(2);
        final TreeNode q = new TreeNode(8);

        final TreeNode result = lowestCommonAncestorOfBST.lowestCommonAncestorIterative(root, p, q);
        assertEquals(root, result);
    }

    @Test
    void testLowestCommonAncestorBSTNullSearchTreeForNullRoot() {
        final TreeNode root = null;

        // Nodes to find LCA for
        final TreeNode p = new TreeNode(2);
        final TreeNode q = new TreeNode(8);

        final TreeNode result = lowestCommonAncestorOfBST.lowestCommonAncestorIterative(root, p, q);
        assertEquals(root, result);
    }

    @AfterAll
    static void tearDown() {
        lowestCommonAncestorOfBST = null;
    }
}
