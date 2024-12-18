/**
Given the root of a binary tree, return the preorder traversal of its nodes' values.
Input: root = [1,null,2,3]
Output: [1,2,3]
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> visitedNodes = new ArrayList<>();
        preorder(root, visitedNodes);
        return visitedNodes;
    }

    public void preorder(TreeNode root, List<Integer> visitedNodes)
    {
        if(root == null)
        {
            return;
        }
        // root -> left -> right
        visitedNodes.add(root.val);
        preorder(root.left, visitedNodes);
        preorder(root.right, visitedNodes);
    }
}
