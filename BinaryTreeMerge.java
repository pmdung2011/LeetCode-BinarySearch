public class BinaryTreeMerge {
    public TreeNode merge(TreeNode t1, TreeNode t2){
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        //Sum up the tree value on each level
        TreeNode res = new TreeNode(t1.val + t2.val);
        res.left = merge(t1.left, t2.left);
        res.right = merge(t1.right, t2.right);
        return res;
    }
}
