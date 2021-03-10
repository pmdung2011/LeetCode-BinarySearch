import java.util.LinkedList;
import java.util.Queue;

public class BinaryTraversal {


    public static void main(String args[])
    {
        /* creating a binary tree and entering
         the nodes */
        TreeNode tree_level = new TreeNode();
        tree_level = new TreeNode(1);
        tree_level.left = new TreeNode(2);
        tree_level.right = new TreeNode(3);
        tree_level.left.left = new TreeNode(4);
        tree_level.left.right = new TreeNode(5);

        System.out.println("InOrder traversal of binary tree is ");
        inOrder(tree_level);
        System.out.println();
        System.out.println("Preorder traversal of binary tree is ");
        preOrder(tree_level);
        System.out.println();
        System.out.println("PostOrder traversal of binary tree is ");
        postOrder(tree_level);
        System.out.println("Tree level traversal: ");
        levelOrderTraversal(tree_level);
    }
    //Left Root Right
    private static void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //Root Left Right
    private static void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Left Right Root
    private static void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    private static void levelOrderTraversal(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode cur = queue.poll();

            System.out.print(cur.val + " ");

            if(cur.left != null) queue.offer(cur.left);
            if(cur.right != null) queue.offer(cur.right);
        }
    }

}
