public class PalindromeNumber {
    public static boolean solve(int n){
        //Reverse then compare
        int org = n;
        int rev = 0;

        //Reversing
        while(n != 0){
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        return (org == rev);
    }

    public static void main(String[] args){
        System.out.println(solve(123));
        System.out.println(solve(121));
        System.out.println(solve(1221));
    }
}
