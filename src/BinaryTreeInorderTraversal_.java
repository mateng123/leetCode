import java.util.*;

public class BinaryTreeInorderTraversal_ {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //递归
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new LinkedList<>();
//         inorderTraversal(list,root);
//         return list;
//     }

//     public void inorderTraversal(List<Integer> list,TreeNode root){
//         if(root==null){
//             return;
//         }
//         inorderTraversal(list,root.left);
//         list.add(root.val);
//         inorderTraversal(list,root.right);
//     }

    //迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode p = stack.pop();
            list.add(p.val);
            cur = p.right;
        }
        return list;
    }
}
