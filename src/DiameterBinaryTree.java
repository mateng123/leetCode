//不知道为什么有四个测试用例没通过
public class DiameterBinaryTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        return getHight(root.left)+getHight(root.right);
    }

    public int getHight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getHight(root.left),getHight(root.right))+1;
    }
}
