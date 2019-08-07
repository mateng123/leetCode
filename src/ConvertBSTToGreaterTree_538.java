
public class ConvertBSTToGreaterTree_538 {

    int sum =0;
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode convertBST(TreeNode root) {
        if (root==null){
            return root;
        }else{
            convertBST(root.right);
            root.val = sum;
            sum += root.val;
            convertBST(root.left);
            return root;
         }

    }
}
