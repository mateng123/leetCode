public class KthSmallestElementBST_230 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int n = 0;
    int res = -1;

    public int kthSmallest(TreeNode root, int k) {
        help(root, k);
        return res;
    }

    public void help(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        kthSmallest(root.left, k);
        n++;
        if (n == k) {
            res = root.val;
        }

        kthSmallest(root.right, k);
    }
}
