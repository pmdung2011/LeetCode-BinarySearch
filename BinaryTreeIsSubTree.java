public class BinaryTreeIsSubTree {
    public boolean solve(TreeNode s, TreeNode t){
        if(s == null) return t == null;
        return isSame(s, t) || solve(s.right, t) || solve(s.left, t);
    }

    private boolean isSame(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
}
