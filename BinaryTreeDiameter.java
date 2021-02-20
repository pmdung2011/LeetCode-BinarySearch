//543. Diameter of Binary Tree
/**
 * The diameter of a tree T is the largest of the following quantities:
 * the diameter of T’s left subtree.
 * the diameter of T’s right subtree.
 * the longest path between leaves that goes through the root of T
 * (this can be computed from the heights of the subtrees of T)
 */

public class BinaryTreeDiameter {
    /*The function Compute the "height" of a tree. Height is the
    number f nodes along the longest path from the root node
    down to the farthest leaf node.*/
    static int height(TreeNode root){
        //Base case, tree is empty
        if(root == null) return 0;

        /* If tree is not empty then height = 1 + max of left
        height and right heights */
        return (Math.max(height(root.left), height(root.right)) + 1);
    }

    // Method to calculate the diameter
    static int diameter(TreeNode root){
        //base case, tree is empty
        if(root == null) return 0;

        //get height of left and right sub-tree
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        //get diameter of left and right sub-tree
        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);

        /* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right subtree
         */
        return Math.max(lHeight + rHeight, Math.max(lDiameter, rDiameter));
    }

    //A wrapper over diameter(TreeNode root)
    static int solve(TreeNode root){
        return diameter(root);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(6);
        tree.right = new TreeNode(7);
        tree.left.left = new TreeNode(9);
        tree.left.right = new TreeNode(10);
        System.out.println(solve(tree));

    }
}
