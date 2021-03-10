/**
 * Check if the target string is a substring
 * if yes, return the index in the original string
 * else return -1
 */
public class IsSubstring {
    public static int isSubstring(String s1, String s2){
        /**
         * An efficient solution would need only one traversal i.e. O(n) on the longer string s1.
         * Here we will start traversing the string s1 and maintain a pointer for string s2 from 0th index.
         For each iteration we compare the current character in s1 and check it with the pointer at s2.
         If they match we increment the pointer on s2 by 1. And for every mismatch we set the pointer back to 0.
         Also keep a check when the s2 pointer value is equal to the length of string s2,
         if true we break and return the value (pointer of string s1 – pointer of string s2)
         */
        int i; //pointer for s1
        int t = 0; //pointer for s2
        for (i = 0; i < s1.length() ; i++) {
            //in case, s2 is empty string
            if(t == s2.length()) break; //stop the for loop

            //check if char at current index of two strings are the same
            if(s1.charAt(i) == s2.charAt(t)){
                t++;
            }
            else{
                t = 0;
            }
        }
        //in case want to return the substring
        //System.out.println(s1.substring(i-t,t));
        return (t < s2.length()) ? -1 : i - t;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("GeeksForGeek", "For"));
        System.out.println(isSubstring("GeeksForGeek", "Gaet"));
    }
}
