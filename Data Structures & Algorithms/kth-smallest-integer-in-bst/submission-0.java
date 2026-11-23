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
    ArrayList<Integer> inorderlist=new ArrayList<>();
    void inorder(TreeNode root){
        if(root==null)
        return ;
        inorder(root.left);
        inorderlist.add(root.val);
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        for(int i=0;i<inorderlist.size();i++){
            if(i+1==k){
            return inorderlist.get(i);
        }}
         return -1;
    }
   
}
