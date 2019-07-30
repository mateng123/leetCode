
public class MergeTwoBinaryTrees_617 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return null;
        }
        TreeNode newNode;
        if(t1!=null&&t2!=null){
            newNode = new TreeNode(t1.val+t2.val);
            newNode.right = mergeTrees(t1.right,t2.right);
            newNode.left = mergeTrees(t1.left,t2.left);
        }else if (t1!=null&&t2==null){
            newNode = new TreeNode(t1.val);
            newNode.right = mergeTrees(t1.right,null);
            newNode.left = mergeTrees(t1.left,null);
        }else{
            newNode = new TreeNode(t2.val);
            newNode.right = mergeTrees(null,t2.right);
            newNode.left = mergeTrees(null,t2.left);
        }


        return newNode;
    }
}
