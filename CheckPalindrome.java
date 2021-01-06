package HackerRank;

import java.util.Objects;

public class CheckPalindrome {
    public static boolean isPanlindrome(String str) {
        //Method 1:
        //if (str== null){
  //          return false;
 //         }
//        StringBuilder strBld = new StringBuilder(str);
//        strBld.reverse();
//        return strBld.toString().equals(str);

        //Method 2:

        /*
        * NOTICE:
        * String substring(int beginIndex, int endIndex)
        Returns a new string that is a substring of this string.
        * The substring begins at the specified beginIndex and extends to the character at
        * index "endIndex – 1"
        * */
        // if length is 0 or 1 then String is palindrome
       // if(str.length() == 0 || str.length() == 1)
//            return true;
//        if(str.charAt(0) == str.charAt(str.length()-1))
            /* check for first and last char of String:
             * if they are same then do the same thing for a substring
             * with first and last char removed. and carry on this
             * until you string completes or condition fails
             * Function calling itself: Recursion
             */
//            return isPanlindrome(str.substring(1, str.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
//        return false;

        //Method3:
        if (str == null || str.isEmpty()){
            return false;
        }
        int counter = 0;
        //Remove space and special characters
        str = str.replaceAll("\\W", "").toLowerCase();
        System.out.println("new String: " + str);
        for (int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                counter++;
            }
        }
        return counter == str.length()/2;
    }

    public static void main(String[] args){
        String str1 = "Hannahx";
        String str2 = "cocoococ";
        String str3 = "Race a car";

        System.out.println(isPanlindrome(str1));
        System.out.println(isPanlindrome(str2));
        System.out.println(isPanlindrome(str3));
    }
}
