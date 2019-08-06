public class LowestCommonAncestorBinaryTree_236 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        help(root, p, q);
        return this.ans;
    }

    public int help(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return 0;
        }
        int left = help(root.left, p, q);
        int right = help(root.right, p, q);
        int mid = (root == p || root == q) ? 1 : 0;
        if ((left + right + mid) >= 2) {
            this.ans = new TreeNode(root.val);
            return 1;
        }
        return (left + mid + right) > 0 ? 1 : 0;
    }
}
