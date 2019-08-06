import java.util.*;

public class ConstructBinaryTreePreorderInorderTraversal_105 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int cur = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int left, int right) {

        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[cur]);
        int l = map.get(root.val);
        cur++;


        root.left = buildTree(preorder, inorder, left, l - 1);
        root.right = buildTree(preorder, inorder, l + 1, right);

        return root;
    }
}
