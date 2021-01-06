package HackerRank;

import java.util.Arrays;

//344. Reverse String
/*
* Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
* */
public class ReverseString {
//    public static char[] reverseString(char[] s) {
//        for (int i = 0; i <  (s.length - 1)/2  ; i++) {
//            char temp = s[i];
//            s[i] = s[s.length - i -1];
//            s[s.length-1-i] = temp;
//        }
//        return s;
//    }
    //optimal solution

    public static char[] reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start < end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
        return s;
    }


    public static void main(String[] args){
        char[] s = {'a','b','c','d','e'};
        System.out.println(Arrays.toString(reverseString(s)));

    }
}
