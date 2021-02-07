
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
}


public class BinaryTreeLevelOrderTraversalII {
    //BinaryTreeLevelOrderTraversal_1

    public List<List<Integer>> solve(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){//keep processing until there is nothing in the queue
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(); //place to store current level values
            //we have to loop through all the current values in the queue
            for(int i = 0; i < size; i++){
                TreeNode current = queue.remove(); //get the first node in the queue
                currentLevel.add(current.val); //add the value to the list

                //check the children of the node, if exist, then add to the queue
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            res.add(currentLevel);
        }

        return res;
    }
}
