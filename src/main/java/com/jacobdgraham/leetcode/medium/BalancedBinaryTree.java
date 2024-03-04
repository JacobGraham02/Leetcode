package com.jacobdgraham.leetcode.medium;

import com.jacobdgraham.leetcode.utils.TreeNode;

/*
Given a binary tree, determine if it is
height-balanced
.
 */
class BalancedBinaryTree {

    /*
         1
        / \
       2   3
      / \   \
     4   5   6
            /
           7

    Now, let's trace the function call stack for the heightOfTree() method when called on this binary tree:

        Initial call: heightOfTree(root), where root is the root node of the binary tree.
            root = 1
            Function call stack: heightOfTree(1)

        At node 1:
            Recursive call for the left subtree: heightOfTree(2)
            Recursive call for the right subtree: heightOfTree(3)
            Function call stack: heightOfTree(1) -> heightOfTree(2), heightOfTree(1) -> heightOfTree(3)

        At node 2:
            Recursive call for the left subtree: heightOfTree(4)
            Recursive call for the right subtree: heightOfTree(5)
            Function call stack: heightOfTree(1) -> heightOfTree(2) -> heightOfTree(4), heightOfTree(1) -> heightOfTree(2) -> heightOfTree(5)

        At node 3:
            No left subtree, so height is 0
            Recursive call for the right subtree: heightOfTree(6)
            Function call stack: heightOfTree(1) -> heightOfTree(2) -> heightOfTree(4), heightOfTree(1) -> heightOfTree(2) -> heightOfTree(5), heightOfTree(1) -> heightOfTree(3) -> heightOfTree(6)

        At node 4, 5, and 6:
            No further subtrees, so height is 0
            Function call stack: heightOfTree(1) -> heightOfTree(2) -> heightOfTree(4), heightOfTree(1) -> heightOfTree(2) -> heightOfTree(5), heightOfTree(1) -> heightOfTree(3) -> heightOfTree(6)

        At node 7:
            No left subtree, so height is 0
            No further subtrees
            Function call stack: heightOfTree(1) -> heightOfTree(3) -> heightOfTree(6) -> heightOfTree(7)

        Backtracking:
            At node 7, no further subtrees, so the height is calculated as 0 + 1 = 1
            At node 6, right subtree's height is 1
            At node 3, right subtree's height is 2
            At node 1, left subtree's height is 3 and right subtree's height is 2, so the maximum height is 3
            Function call stack: heightOfTree(1) (complete)
    */
    public boolean isBalanced(TreeNode root) {
        /*
        If the tree is empty, it is automatically balanced. We want a helper method that will determine the height of the tree. 
        Because we are traversing the entire Tree to determine if each element creates a height balanced tree, we must use
        recursion. 
        */
        if (root == null) {
            return true;
        }

        /*
        If the tree does not have any height (i.e., no nodes) return false
        */
        if (heightOfTree(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public int heightOfTree(TreeNode root) {
        /*
        Because we are using recursion, we have to specify a base case where the recursion call stack will end. 
        */
        if (root == null) {
            return 0;
        }
        /*
        Use recursion to calculate the height of the left and right subtrees by iterating through all of the nodes in the tree. 
        */
        int leftSubtreeHeight = heightOfTree(root.left);
        int rightSubtreeHeight = heightOfTree(root.right);

        /*
        We must consider 2 possible scenarios after getting the height of the left and right subtrees:
            In case the left or right subtree is unbalanced, return -1
            In case the left or right subtree heights differs by more than 1, return -1
        */
        if (leftSubtreeHeight == -1 || rightSubtreeHeight == -1) {
            return -1;
        }

        if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {
            return -1;
        }

        /*
        Determining the maximum height of the left and right subtrees is essential for accurately calculating the height of the 
        current subtree and determining whether it's balanced. It ensures that the algorithm correctly identifies unbalanced subtrees 
        and terminates recursion at the appropriate points.
        */
        return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
    }
}