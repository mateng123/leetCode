import java.util.*;
public class BinaryTreeZigzagLevelOrderTraversal_103 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if(root==null){
                return res;
            }
            int cur = 0;
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                res.add(new ArrayList<>());

                for(int i=0;i<size;i++){
                    TreeNode temp = queue.poll();
                    if (cur%2==0)
                        res.get(cur).add(temp.val);
                    else
                        res.get(cur).add(0,temp.val);
                    if(temp.left!=null) queue.add(temp.left);
                    if(temp.right!=null) queue.add(temp.right);
                }
                cur++;
            }
            return res;
        }
    }
