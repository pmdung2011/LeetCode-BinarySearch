//Print a 2D matrix spirally
//54. Spiral Matrix
import java.util.ArrayList;
import java.util.List;

/**
 * Left to right, top to bottom, right to left, bottom to top
 */
public class MatrixSpiral {
    public static List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> res = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        //Define boundaries
        int top = 0;
        int bottom = row -1;
        int left = 0;
        int right = col - 1;

        //Define direction
        int dir = 1;

        //Traverse through the matrix
        while (top <= bottom && left <= right){
            //traverse left -> right
            if(dir == 1){
                for(int i = left; i <= right; i++){
                    res.add(matrix[top][i]);
                }
                top++;
                dir = 2;
            }
            //Top -> bottom
            else if(dir ==  2){
                for(int i = top; i <= bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;
                dir = 3;
            }
            //Right -> left
            else if(dir == 3){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
                dir = 4;
            }
            //bottom -> top
            else {
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
                dir = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[][] = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(spiralMatrix(a));
    }
}
