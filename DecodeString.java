import java.util.*;

//LeetCode
//394. Decode String
public class DecodeString {
    public static String solve(String s){
        Stack<Integer> nums = new Stack<>(); //stack to store repeat time
        Stack<StringBuilder> strs = new Stack<>(); //stack to store string in each brackets
        StringBuilder res = new StringBuilder();
        int count  = 0;
        /**
         * Loop through the string s
         * check for 3 cases:
         * 1 - If charAt(i) is digit -> repeat time
         * 2 - if '[' or ']'
         * 3 - if is string
         */
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                count = count * 10 + (c - '0');
            }

            else if(c == '['){
                nums.push(count);
                strs.push(res);

                //Reset counter and res string
                count = 0;
                res = new StringBuilder("");
            }

            else if(c == ']'){
                StringBuilder tmp = new StringBuilder(strs.pop());
                int repeatTime = nums.pop();

                //Repeat the string based on counter
                for(int j = 0; j < repeatTime; j++){
                    tmp.append(res);
                }
                //tmp.append(String.valueOf(res).repeat(Math.max(0, repeatTime))); //Replace for loop
                res = tmp;
            }

            else {
                res.append(c);
            }
        }
        return res.toString();

    }
}
