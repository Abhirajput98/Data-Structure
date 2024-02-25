package Lec_45;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level_order_ {

//    public static List<List<Integer>> level(TreeNode root){
//        if(root==null){
//            return null;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        List<List<Integer>> ans= new ArrayList();
//        while (!queue.isEmpty()) {
//            int size=queue.size();
//            List<Integer> ll = new ArrayList();
//            for(int i =0;i<size;i++){
    // ab level order ke lliye jo queue ka current size hoga utne hi element  use level mein occur honge
//
//
//                TreeNode nn = queue.remove();
//                ll.add(nn.val);
//                if(nn.left!=null){
//                    queue.add(nn.left);
//                }
//                if(nn.right!=null){
//                    queue.add(nn.right);
//                }
//
//            }
//            ans.add(ll);
//
//        }
//
//        //ans.add(ll);
//        return ans;
//    }
}
