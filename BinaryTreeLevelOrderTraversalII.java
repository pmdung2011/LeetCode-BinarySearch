
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeLevelOrderTraversalII {
    // BinaryTreeLevelOrderTraversal_1

    public List<List<Integer>> solve(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>(); // final result

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {// keep processing until there is nothing in the queue
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(); // place to store current level values
            // we have to loop through all the current values in the queue
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove(); // get the first node in the queue
                currentLevel.add(current.val); // add the value to the list

                // check the children of the node, if exist, then add to the queue
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            res.add(currentLevel);
        }
        return res;
    }

    public List<List<Integer>> solve2(TreeNode root) {
        // Create a list to store result
        List<List<Integer>> res = new LinkedList<>();

        // check if the tree is null
        if (root == null) {
            return res;
        }

        // Create a queue to store nodes at each level
        Queue<TreeNode> queue = new LinkedList<>();

        // Add root as a first element of the queue
        queue.offer(root); // offer is preferably to add since it does not return error but boolean false

        // Keep processing until the queue is empty
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new LinkedList<>(); // To store nodes value of current level

            // Loop through the queue to process
            for (int i = 0; i < size; i++) {
                // if the parent has any children, add them to the queue
                // REMEMBER: LEFT FIRST, THEN RIGHT
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                // Pop out parent from the queue, add parent's value to the currentList
                currentLevel.add(queue.poll().val);
            }
            // Finally, the difference is here, we add the result from the end of the list
            res.add(0, currentLevel);
        }
        return res;

    }
}
