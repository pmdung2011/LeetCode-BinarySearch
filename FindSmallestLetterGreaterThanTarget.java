//744. Find Smallest Letter Greater Than Target

import java.util.Arrays;

public class FindSmallestLetterGreaterThanTarget {
    //Brute force
    public static char solve(char[] letters, char target){
        int distance = Integer.MAX_VALUE;
        for(char c : letters){
            if((int)target < (int)c){
                distance = Math.min(distance, Math.abs((int) c - (int) target));
            }
        }

        if(distance == Integer.MAX_VALUE){
            Arrays.sort(letters);
            return letters[0];
        }

        int res = (int) target + distance;
        return (char)res;
    }

    //Binary search
    public static char solve1(char[] letters, char target){
        char res= letters[0]; //in case there is no letter > target
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid] <= target)
            {
                start=mid+1;
            }
            else
            {
                res = letters[mid];
                end = mid - 1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        char[] letters = {'c', 'g', 'f'};
        char target = 'd';

        System.out.println(solve(letters, target));
    }
}
