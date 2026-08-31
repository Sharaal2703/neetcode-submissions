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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root,0);
        return ans;
        
    }
    public void traverse(TreeNode root,int depth)
    {
        if(root==null)
        {
            return;
        }
        if(ans.size()==depth)
        {
            ans.add(root.val);
        }
        traverse(root.right,depth+1);
        traverse(root.left,depth+1);
    }
}
