/**
Given the root of a binary tree, return the inorder traversal of its nodes' values.
Input: root = [1,null,2,3]
Output: [1,3,2]
 */
/**
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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> visitedNodes = new ArrayList<>();
        inorder(root, visitedNodes);
        return visitedNodes;
    }

    public void inorder(TreeNode root, List<Integer> visitedNodes)
    {
         if (root == null)
            return;
        // left -> root -> right
        inorder(root.left, visitedNodes);
        visitedNodes.add(root.val);
        inorder(root.right, visitedNodes);
    }
}
