
public class ConvertSortedArrayBinarySearchTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        return BST(nums,left,right);
    }

    public TreeNode BST (int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.right=BST(nums,mid+1,right);
        root.left=BST(nums,left,mid-1);

        return root;
    }
}
