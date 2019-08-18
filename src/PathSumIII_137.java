
public class PathSumIII_137 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


        int total=0;
        public int pathSum(TreeNode root, int sum) {
            if(root==null){
                return total;
            }
            Sum(root,sum);
            pathSum(root.left,sum);
            pathSum(root.right,sum);
            return total;
        }

        public void Sum(TreeNode root,int sum){
            if(root==null){
                return;
            }
            sum = sum-root.val;
            if(sum==0){
                total++;
            }
            Sum(root.left,sum);
            Sum(root.right,sum);

        }
}
