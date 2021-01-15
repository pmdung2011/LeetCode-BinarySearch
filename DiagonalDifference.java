import java.util.List;

//HackerRank
public class DiagonalDifference {
    public static int solve(List<List<Integer>> arr){
        int left = 0;
        int right = 0;

        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            left += arr.get(i).get(i);
            right += arr.get(i).get(j);
        }
        return Math.abs(left -right);
    }

}