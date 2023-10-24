package com.jacobdgraham.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jacobdgraham.leetcode.utils.BinaryTreeNode;

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
        final BinaryTreeNode root = new BinaryTreeNode(expectedNodeValue);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(8);
        root.left.left = new BinaryTreeNode(0);
        root.left.right = new BinaryTreeNode(4);
        root.right.left = new BinaryTreeNode(7);
        root.right.right = new BinaryTreeNode(9);
        root.left.right.left = new BinaryTreeNode(3);
        root.left.right.right = new BinaryTreeNode(5);

        // Nodes to find LCA for
        final BinaryTreeNode p = new BinaryTreeNode(2);
        final BinaryTreeNode q = new BinaryTreeNode(8);

        final BinaryTreeNode result = lowestCommonAncestorOfBST.lowestCommonAncestorIterative(root, p, q);
        assertEquals(root, result);
    }

    @Test
    void testLowestCommonAncestorBSTTwoElementTree() {
        final int expectedNodeValue = 2;
        final BinaryTreeNode root = new BinaryTreeNode(expectedNodeValue);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(8);
        root.left.left = new BinaryTreeNode(0);
        root.left.right = new BinaryTreeNode(4);
        root.right.left = new BinaryTreeNode(7);
        root.right.right = new BinaryTreeNode(9);
        root.left.right.left = new BinaryTreeNode(3);
        root.left.right.right = new BinaryTreeNode(5);

        // Nodes to find LCA for
        final BinaryTreeNode p = new BinaryTreeNode(2);
        final BinaryTreeNode q = new BinaryTreeNode(8);

        final BinaryTreeNode result = lowestCommonAncestorOfBST.lowestCommonAncestorIterative(root, p, q);
        assertEquals(root, result);
    }

    @Test
    void testLowestCommonAncestorBSTNullSearchTreeForNullRoot() {
        final BinaryTreeNode root = null;

        // Nodes to find LCA for
        final BinaryTreeNode p = new BinaryTreeNode(2);
        final BinaryTreeNode q = new BinaryTreeNode(8);

        final BinaryTreeNode result = lowestCommonAncestorOfBST.lowestCommonAncestorIterative(root, p, q);
        assertEquals(root, result);
    }

    @AfterAll
    static void tearDown() {
        lowestCommonAncestorOfBST = null;
    }
}
