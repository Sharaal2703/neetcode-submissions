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
    ArrayList<Integer> arr=new ArrayList<>();
    public void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        
        preOrder(root.left);
        arr.add(root.val);
        preOrder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        preOrder(root);
        int n=1;
        for(int i:arr)
        {
            System.out.println(i);
            if(n==k)
            {
                return i;
            }
            n++;
        }
        return -1;

        
    }
}
