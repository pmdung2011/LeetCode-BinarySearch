public class BinaryTreePathSum {
    public boolean solve(TreeNode root, int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum) return true;
        return solve(root.left, sum - root.val) || solve(root.right, sum-root.val);
    }
}
