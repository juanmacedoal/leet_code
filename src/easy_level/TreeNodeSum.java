package easy_level;

/**
 * You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
 *
 * Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.
 *
 * root: 10, left node: 4, right node: 6, the result is true
 * root: 5, left node: 3, right node: 1, the result is false
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class TreeNodeSum {
  public boolean checkTree(TreeNode root) {
    return root.left.val + root.right.val == root.val;
  }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
