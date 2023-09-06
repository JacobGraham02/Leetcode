package com.jacobdgraham.leetcode.easy;

import java.util.Stack;

/**
 * Given the root of a binary tree, invert the tree, and return its root.

Example 1:
    Input: root = [4,2,7,1,3,6,9]
    Output: [4,7,2,9,6,3,1]
Example 2:
    Input: root = [2,1,3]
    Output: [2,3,1]
Example 3:
    Input: root = []
    Output: []

Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100

 */
public final class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
    
        final Stack<TreeNode> node_stack = new Stack<>();
        node_stack.push(root);
        
        while (!node_stack.isEmpty()) {
            TreeNode current_node = node_stack.pop();
            TreeNode temp_left_node = current_node.left;
            current_node.left = current_node.right;
            current_node.right = temp_left_node;
            
            if (current_node.left != null) {
                node_stack.push(current_node.left);
            }
            if (current_node.right != null) {
                node_stack.push(current_node.right);
            }
        }
        return root;
    }
}
