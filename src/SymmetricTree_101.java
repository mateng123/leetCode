import java.util.*;

public class SymmetricTree_101 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    //递归
//     public boolean isSymmetric(TreeNode root) {
//         return isMirror(root,root);

//     }

//     public boolean isMirror(TreeNode root1,TreeNode root2){
//         if(root1==null&&root2==null){
//             return true;
//         }
//         if(root1==null||root2==null){
//             return false;
//         }

//         return (root1.val==root2.val)&&isMirror(root1.left,root2.right)
//             &&isMirror(root1.right,root2.left);
//     }

    //迭代
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return true;
        }
        queue.offer(root);
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if(node1==null&&node2==null){
                continue;
            }

            if((node1==null||node2==null)||(node1.val!=node2.val)){
                return false;
            }
            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }
}
