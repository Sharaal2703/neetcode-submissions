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
    public String traverse(TreeNode root)
    {
        if(root==null)
        {
            return "null";
        }
        StringBuilder sb=new StringBuilder("^");
        sb.append(root.val);
        sb.append(traverse(root.left));
        sb.append(traverse(root.right));
        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String preRoot=traverse(root);
        String presubRoot=traverse(subRoot);
        return(preRoot.contains(presubRoot));

    }
}
