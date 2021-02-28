import java.util.*;
public class BinaryTreePathSum {
    //Recursive
    public boolean solve(TreeNode root, int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == sum) return true;
        return solve(root.left, sum - root.val) || solve(root.right, sum-root.val);
    }


    public boolean solve2(TreeNode root, int sum){
        //Iterative
        if(root == null) return false;
        Stack<TreeNode> tree = new Stack<>();
        Stack<Integer> value = new Stack<>();

        tree.push(root);
        value.push(root.val);

        while(!tree.isEmpty()){
            TreeNode tmp = tree.pop();
            int val = value.pop();

            if(tmp.left == null && tmp.right == null){
                if(val == sum) return true;
            }
            else{
                if(tmp.left != null){
                    tree.push(tmp.left);
                    value.push(tmp.left.val + val);
                }
                if(tmp.right != null){
                    tree.push(tmp.right);
                    value.push(tmp.right.val + val);
                }
            }
        }
        return false;
    }


}
