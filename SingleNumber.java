

import java.util.*;

/*
* Given a non-empty array of integers, every element appears twice except for one. Find that single one.
* Input: [2,2,1]
* Output: 1
* */
//ONLY WORK FOR AN ARRAY WITH THREE ELEMENTS
// A XOR B XOR A = B
public class  SingleNumber {
    //Only works with nums.length = odd, and only if nums has unique number.
    public static int singleNum(int[] nums){
        int a = 0;
        //a XOR 0 = a, a XOR a = 0, a XOR b = 1; the same return 0, different return 1
        for (int i : nums){
            System.out.println("a: " + a);
            System.out.println("nums[i]: " + i);
            a ^= i; //a XOR a XOR b = b;
        }
        return a;
    }
    
    public static int uniqueNum(int[] nums){
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i) ){
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(Integer.valueOf(i)); //remove() only works with int, not Object
            }
        }
        System.out.println(no_duplicate_list);
        return no_duplicate_list.get(0);
    }

    public static int uniqueMath(int[] nums){
        int sumNums = 0;
        int sumSet = 0;
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
                sumSet += i;
            }
            sumNums += i;
        }
        // 2∗(a+b+c)−(a+a+b+b+c)=c
        return 2*sumSet - sumNums;
    }


    public static int solve(int[] nums){
        int[] freg = new int[nums.length+1];
        int res = 0;
        for(int i : nums){
            freg[i]++;
        }
        for (int i = 0; i < freg.length ; i++) {
            if(freg[i] == 1){
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main (String[] args){

        int[] nums = {2,2,1,1,3};
        System.out.println(solve(nums));
       // System.out.println(c);

    }
}
