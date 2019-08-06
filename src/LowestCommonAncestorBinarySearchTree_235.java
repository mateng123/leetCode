public class LowestCommonAncestorBinarySearchTree_235 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //递归写法
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        int pVal = p.val;
//        int qVal = q.val;
//
//        int rootVal = root.val;
//
//        if(pVal < rootVal && qVal < rootVal){
//            return lowestCommonAncestor(root.left, p,  q);
//        }
//
//        else if(pVal > rootVal && qVal > rootVal){
//            return lowestCommonAncestor(root.right, p,  q);
//        }
//
//        else{
//            return root;
//        }
//    }

    //遍历写法
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;

        TreeNode curNode = root;

        while (curNode != null) {
            if (pVal < curNode.val && qVal < curNode.val) {
                curNode = curNode.left;
            } else if (pVal > curNode.val && qVal > curNode.val) {
                curNode = curNode.right;
            } else {
                return curNode;
            }
        }

        return null;
    }
}
