//Max depth or Height of a tree
public class BinaryTreeMaxDepth {
    public int solve(TreeNode root){
        if(root == null) return 0;

        int lDepth = solve(root.left) + 1;
        int rDepth = solve(root.right) + 1;

        return Math.max(lDepth, rDepth);

    }
}
