//235. Lowest Common Ancestor of a Binary Search Tree
public class BinaryTreeLCA {
    public TreeNode solve(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;

        //THis is a Binary Search Tree, checking the value to see if it is
        // a left sub-tree or right sub-tree
        //Left sub tree
        if(q.val  < root.val && p.val < root.val){
            return solve(root.left, p, q);
        }
        //right sub-tree
        else if (p.val > root.val && q.val > root.val){
            return solve(root.right, p, q);
        }

        else{
            return root;
        }
    }
}
