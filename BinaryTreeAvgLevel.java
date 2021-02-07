import javax.sound.sampled.Line;
import java.util.*;
public class BinaryTreeAvgLevel {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();

        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>(); //store nodes at each level
        queue.offer(root);

        //Keep processing until the queue is empty
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0.0;
            //Loop through the queue,
            //pop out the parents,
            //sum up the nodes' value
            //add there children to the queue if exist
            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                assert current != null;
                sum += current.val; //pop then sum up for the current level

                //add the children if exist
                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            res.add(sum/size); //add the avg to result list
        }
        return res;
    }
}
