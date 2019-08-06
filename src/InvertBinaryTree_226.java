import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //递归写法
//    public TreeNode invertTree(TreeNode root) {
//        if (root==null){
//            return root;
//        }
//        TreeNode right = invertTree(root.right);
//        TreeNode left = invertTree(root.left);
//        root.right = left;
//        root.left = right;
//        return root;
//    }

    //遍历写法
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            TreeNode temp = currNode.left;
            currNode.left = currNode.right;
            currNode.right = temp;
            if (currNode.right!=null) queue.add(currNode.right);
            if (currNode.left!=null) queue.add(currNode.left);
        }
        return root;
    }


}
