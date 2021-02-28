//CTCI

/**
 * Implements an algorithm to determine if a string has all unique characters. No extra data structure.
 */
public class IsUniqueChars {
    public static boolean solve(String s){
        //Assume 128 characters
        boolean[] ch = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if(ch[val]){
                return false;
            }
            ch[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abccd";
        System.out.println(solve(s));
    }
}
