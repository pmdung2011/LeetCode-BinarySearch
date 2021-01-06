package HackerRank;
/*
* Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
* */
public class ReverseInt {
//    public static int reverseInt(int num){
//        String str = new StringBuilder().append(Math.abs(num)).reverse().toString();
//        int reversed = Integer.parseInt(str);
//        try{
//            return (num < 0) ? reversed*(-1) : reversed;
//        }catch (NumberFormatException e){
//            return 0;
//        }
//    }

    //Method 2:
    public static int reverseInt(int num){
        int reversed = 0;
        while (num!=0){
            //pop the last digit
            int pop = num % 10; // ex: 1234 % 10 = 4
            num /= 10; //get the rest digits from the last one, eg 1234/10 = 123
            //Integer.MAX_VALUE = 2147483647
            //Integer.MAX_VALUE/10 = 214748364
//            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
//                return 0;
//            }
            reversed = reversed*10+pop;

        }
        return reversed;
    }

    public static void main(String[] args){
        int a = 312;
        int b = 210;
        int c = -123;
        int d = 563847412; //MAX

        System.out.println(reverseInt(a));
        System.out.println(reverseInt(b));
        System.out.println(reverseInt(c));
        System.out.println(reverseInt(d));

    }
}
