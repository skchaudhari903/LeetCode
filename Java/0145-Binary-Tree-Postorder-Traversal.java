/**
Given the root of a binary tree, return the postorder traversal of its nodes' values.
Input: root = [1,null,2,3]
Output: [3,2,1]
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> visitedNodes = new ArrayList<>();
        postorder(root, visitedNodes);
        return visitedNodes;
    }

     public void postorder(TreeNode root, List<Integer> visitedNodes)
    {
         if (root == null)
            return;
        // left -> right -> root
        postorder(root.left, visitedNodes);
        postorder(root.right, visitedNodes);
        visitedNodes.add(root.val);
    }
}
