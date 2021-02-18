import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMinDepth {
    /** Solution 1: DFS
     * Key point:
     * if a node only has one child -> MUST return the depth of the side with child, i.e. MAX(left, right) + 1
     * if a node has two children on both side -> return min depth of two sides, i.e. MIN(left, right) + 1
     * */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) {
            return Math.max(left, right) + 1;
        }
        else {
            return Math.min(left, right) + 1;
        }
    }


    /** Solution 2: BFS level order traversal
     * Key point: Checking level by level to find the first leaf
     * */
    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1; //start from root
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                assert curNode != null;
                //If find the leaf, stop
                if (curNode.left == null && curNode.right == null) {
                    return level;
                }
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            level++;
        }
        return level;
    }
}
