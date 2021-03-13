

import java.util.Objects;

public class CheckPalindrome {

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

        //Method3: Notice here is the regex, lowercase first before remove
//        if (str == null || str.isEmpty()){
//            return false;
//        }
//
//        //Remove space and special characters
//        str = str.toLowerCase().replaceAll("[^0-9a-z]", "");
//        System.out.println("new String: " + str);
//        for (int i = 0; i < str.length()/2 ; i++) {
//            if(str.charAt(i) == str.charAt(str.length()-i-1)){
//                return false;
//            }
//        }
//        return true;

        public static boolean isPanlindrome(String str){
            if(str == null || str.length() == 0) return true;
            int head = 0;
            int tail = str.length()-1;
            char cHead, cTail;

            while (head <= tail){
                cHead = str.charAt(head);
                cTail = str.charAt(tail);

                //Check if char at current index is character or not
                //isLetterOrDigit returns true if is letter, false for digit
                if(!Character.isLetterOrDigit(cHead)){
                    //if false, means is digit, continue
                    head++;
                }
                else if(!Character.isLetterOrDigit(cTail)){
                    tail--;
                }
                //In case both of them are letters
                else{
                    cHead = Character.toLowerCase(cHead);
                    cTail = Character.toLowerCase(cTail);
                    //Check if the letters are the same or not
                    if(cHead != cTail) return false;
                    head++;
                    tail--;
                }
            }
            return true;
        }


    public static void main(String[] args){
        String str1 = "ab_A";
        String str2 = "A man, a plan, a canal: Panama";
        String str3 = "0P";

        System.out.println(isPanlindrome(str1));
        System.out.println(isPanlindrome(str2));
        System.out.println(isPanlindrome(str3));
    }
}
