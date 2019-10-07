package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Input: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * Output: [1,2,3]
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * <p>
 * **Pre-order traversal** is to visit the root first. Then traverse the left subtree. Finally, traverse the right subtree.
 */
class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(4);

        System.out.println(new Solution().preOrderTraversal(root));
    }

    private List<Integer> preOrderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) {
            return Collections.emptyList();
        }
        process(result, node);
        return result;
    }

    private void process(List<Integer> values, TreeNode node) {
        if (node == null) {
            return;
        }
        process(values, node.left);
        process(values, node.right);
        values.add(node.val);
    }
}