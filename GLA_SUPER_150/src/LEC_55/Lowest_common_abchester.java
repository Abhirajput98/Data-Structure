package LEC_55;

import com.sun.source.tree.Tree;

public class Lowest_common_abchester {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
                return null;
            }
            if(root==p || root ==q){
                return root;

            }
            TreeNode left =lowestCommonAncestor(root.left,p,q);
            TreeNode right =lowestCommonAncestor(root.right,p,q);
            if(left ==null){
                return right;
            }
            if(right ==null){
                return left;
            }
            else{
                return root;
            }


        }
    }
}
