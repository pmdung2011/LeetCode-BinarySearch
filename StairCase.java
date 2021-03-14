//

import java.util.Arrays;

/*
* Sample Input

6
Sample Output

     #
    ##
   ###
  ####
 #####
######
* */
public class StairCase {
    public static void staircase(int n) {
        char[] ch = new char[n];
        Arrays.fill(ch, ' ');
        for (int i = 0; i < ch.length; i++) {
            ch[ch.length - 1 - i] = '#';
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }
}
