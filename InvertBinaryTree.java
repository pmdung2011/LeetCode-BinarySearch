public class InvertBinaryTree {
    //Recursive approach
    //Call invert for left -subtree
    //Call invert for right-subtree
    //swap left and right subtrees

    public TreeNode solve(TreeNode root){
        if(root == null) return root;

        //Invert left and right subtrees
        TreeNode left = solve(root.left);
        TreeNode right = solve(root.right);

        //Swap left and right subtrees
        root.left = right;
        root.right = left;

        return root;
    }
}
