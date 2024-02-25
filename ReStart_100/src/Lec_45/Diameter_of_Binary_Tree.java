package Lec_45;

public class Diameter_of_Binary_Tree {
    public class TreeNode {
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

    class Solution {
        public static int diameterOfBinaryTree(TreeNode root) {
           // return ht(root,0 );
            if(root==null){
                return 0;
            }
            // hume har node ke liye hight calculate krni padegi or max return krni padegi
            int ld= diameterOfBinaryTree(root.left);
            int rd =diameterOfBinaryTree(root.right);
            // jab leaf node per ld or right dia 0 aayega fhr self diameter cal karenge ;
            // jisme hight ko call krengr intialily null jaeyga do no calls mein th -1+-1 = -2
            // -2 aaen ke badd 0 ho jayeta leaf node ke liye diameter

            int sd= ht(root.right)+ht(root.left)+2;

            return Math.max(ld,Math.max(rd,sd));


        }
        public static int ht(TreeNode nn){
        if(nn==null){
            return  -1;

        }
        int lh=ht(nn.left);
        int rh = ht(nn.right);
        return Math.max(lh,rh)+1;
    }


}}
