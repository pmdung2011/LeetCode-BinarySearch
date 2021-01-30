import java.util.*;

class  Solution {
    public int[] solve(int[] lst0, int[] lst1) {
        if (lst0 == null){
            return lst1;
        }
        if(lst1==null){
            return lst0;
        }
        int n = lst0.length;
        int m = lst1.length;
        int tail1 = n-1;
        int tail2 = m-1;
        int combinedTail = n+m-1;
        
        int[] res = new int[n+m];
        
        while(tail1 >= 0 && tail2 >= 0){
            res[combinedTail--] = (lst0[tail1] > lst1[tail2]) ? lst0[tail1--] : lst1[tail2--];
        }
        
        //in case still have remainding for
        //lst0
        while(tail1 >= 0){
            res[combinedTail--] = lst0[tail1--];
        }
        
        while(tail2 >= 0){
            res[combinedTail--] = lst1[tail2--];
        }
        
        return res;
    }
}
