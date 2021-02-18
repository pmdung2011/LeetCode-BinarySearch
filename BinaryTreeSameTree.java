import java.util.*;

public class BinaryTreeSameTree {
    public boolean solve(TreeNode p, TreeNode q) {
        if(p.val != q.val){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            //Pop out the parents
            TreeNode a = queue.poll();
            TreeNode b = queue.poll();

            if(a == null & b == null){
                continue;
            }
            else if (a == null || b == null || a.val != b.val){
                return false;
            }
            queue.offer(a.left);
            queue.offer(b.left);
            queue.offer(a.right);
            queue.offer(b.right);
        }
        return true;

    }
}
