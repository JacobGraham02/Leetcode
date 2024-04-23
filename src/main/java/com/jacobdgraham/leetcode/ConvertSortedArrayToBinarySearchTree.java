package com.jacobdgraham.leetcode;

import com.jacobdgraham.leetcode.utils.TreeNode;

 /*
 Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced 
 binary search tree.

 Input: nums=[-10,-3,0,5,9]
 Output: [0,-3,-9,10,null,5]
 Explanation: [0,-10,5,null,-3,null,9] is also accepted

 A height-balanced binary tree is a binary tree in which the depth of the two subtrees 
 of every node never differs by more than one.
 */
class ConvertSortedArrayToBinarySearchTree {

    public final TreeNode sortedArrayToBST(int[] nums) {
        /*
        In this algorithm, we have to take the middle element of the ascendingly sorted list nums and 
        assign that as the head or root node of the tree. 
        */

        /*
        Base case: If the ascendingly sorted array is empty, we will return null immediately
        */
        if (nums == null || nums.length == 0) {
            return null;
        }
        /*
        A common strategy to use when creating a Tree data structure is to use recursion,
        which is the strategy we will use in the helper function sortedArrayToBST().
        The helper function parameters are listed below:
            nums:  The ascendingly sorted array of integers we want to construct a Tree with
            start: The first element in the array of integers that we are interested in using
            end:   The last element in the array of integers that we are interested in using
        */
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        /*
        If the start array index exceeds the end array index, we must return null
        */
        if (start > end) {
            return null;
        }

        /*
        Calculate the middle index that we will use to separate the array index into 2 parts:
            The middle of the array will be the root node of the subtree
            All of the elements to the left of the root node will be the nodes that are smaller than the root node
            All of the elements to the right of the root node will be the nodes that are larger than the root node
        */
        int middleArrayPointer = start + (end - start) / 2;

        /*
        Create a new TreeNode and initialize the root node of the TreeNode to be the pointer to the integer
        at the middle index in the array.
        */
        final TreeNode treeRootNode = new TreeNode(nums[middleArrayPointer]);

        /*
        Recursively construct the left and right subtrees:
            Left subtree will be recursively constructed with all array elements going from start to mid - 1, to ensure that
            only elements to the left of the middle (root node) element will be used in the Tree
            Right subtree will be recursively constructed with all array elements going from mid + 1 to end, to ensure that
            only elements to the right of the middle (root node) element will be used in the Tree
        */
        treeRootNode.left = sortedArrayToBST(nums, start, middleArrayPointer-1);
        treeRootNode.right = sortedArrayToBST(nums, middleArrayPointer+1, end);

        /*
        Return the root of the constructed tree, as that will bring along with it all of the nodes that were added to the 
        root node
        */
        return treeRootNode;
    }
}