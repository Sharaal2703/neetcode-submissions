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
    public TreeNode invertTree(TreeNode root) {
        // if(root==null)
        // {
        //     return null;
        // }
        // TreeNode left=invertTree(root.left);
        // TreeNode right=invertTree(root.right);
        // root.left=right;
        // root.right=left;
        // return root;
        if(root==null)
        {
            return null;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode n=q.poll();
            TreeNode temp=n.left;
            n.left=n.right;
            n.right=temp;
            if(n.left!=null)
            {
                q.add(n.left);
            }
            if(n.right!=null)
            {
                q.add(n.right);
            }
        }
        return root;
    }
}
