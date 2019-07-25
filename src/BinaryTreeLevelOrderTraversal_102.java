import java.util.*;
public class BinaryTreeLevelOrderTraversal_102 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    //递归
//    List<List<Integer>> res = new LinkedList<>();
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if(root==null){
//            return res;
//        }
//        helper(0,root);
//        return res;
//    }
//
//    public void helper(int level,TreeNode node){
//        if(res.size()==level){
//            res.add(new LinkedList<Integer>());
//        }
//
//        res.get(level).add(node.val);
//        if(node.left!=null){
//            helper(level+1,node.left);
//        }
//        if(node.right!=null){
//            helper(level+1,node.right);
//        }
//    }

    //迭代
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){

            res.add(new LinkedList<Integer>());

            //size会变   所以放到上面
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.remove();
                res.get(level).add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            level++;
        }
        return res;
    }
}
